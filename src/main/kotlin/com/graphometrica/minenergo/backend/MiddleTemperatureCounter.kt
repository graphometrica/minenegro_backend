package com.graphometrica.minenergo.backend

import org.springframework.stereotype.Service
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import javax.annotation.PostConstruct

@Service
class MiddleTemperatureCounter(val weatherRawRepository: WeatherRawRepository,
                               val weatherHistoryRepository: WeatherHistoryRepository,
                               val regionDirectoryRepository: RegionDirectoryRepository) {
    val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

    fun countMiddleTemp() {
        val allRegionsList = regionDirectoryRepository.findAll()
        val allRawWeatherList = weatherRawRepository.findAll()

        var endDateTime = localDateTimeFromString("2018-01-01 00:00")

        var weatherHistoryEntityList: List<WeatherHistoryEntity> = listOf()

        var counter = 0;

        allRegionsList.forEach { regionDirectoryItem ->

            val regionRawWeatherList = allRawWeatherList.filter { it.subjectId == regionDirectoryItem.subjectId }

            var currentDateTime = regionRawWeatherList
                    .map { it.timestamp }
                    .stream().min(LocalDateTime::compareTo).get()

            endDateTime = currentDateTime.plusYears(1L)

            var lastTemperature : Double? = null

            while (currentDateTime.isBefore(endDateTime)) {
                var listOfMomentWeather: List<WeatherRawEntity?> = listOf()
                for (i in (0..4)) {
                    listOfMomentWeather = listOfMomentWeather.plus(regionRawWeatherList.firstOrNull { it.timestamp == currentDateTime.plusYears(i.toLong()) })
                }
                listOfMomentWeather = listOfMomentWeather.filterNotNull()

                var sumOfTemperature: Double = (0).toDouble()

                listOfMomentWeather.forEach { sumOfTemperature += it.temp }

                var middleTemperature = sumOfTemperature / listOfMomentWeather.size

                if (listOfMomentWeather.isEmpty() && lastTemperature!=null) {
                    middleTemperature = lastTemperature
                }

                weatherHistoryEntityList = weatherHistoryEntityList.plus(
                        WeatherHistoryEntity().apply {
                            subjectId = regionDirectoryItem.subjectId
                            middleTemp = middleTemperature
                            timestamp = currentDateTime
                        }
                )

                if (middleTemperature != null) {
                    lastTemperature = middleTemperature
                }

                //println("subjectId = ${regionDirectoryItem.subjectId} ; current time = $currentDateTime ; middle temp = $middleTemperature; list size = ${listOfMomentWeather.size}")

                currentDateTime = currentDateTime.plusHours(1L)
            }

            weatherHistoryRepository.saveAll(weatherHistoryEntityList)
            counter += 1
            println("${regionDirectoryItem.subjectId} ${regionDirectoryItem.name} done! $counter/75")
        }
    }

    //@PostConstruct
    fun runThis() {
        countMiddleTemp()
    }

    fun localDateTimeFromString(raw: String): LocalDateTime {
        return try {
            LocalDateTime.parse(raw, formatter)
        } catch (ex: Exception) {
            println("Error while read localdateime $raw")
            LocalDateTime.now()
        }
    }
}