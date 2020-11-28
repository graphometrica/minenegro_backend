package com.graphometrica.minenergo.backend.weather.service

import com.graphometrica.minenergo.backend.weather.entity.WeatherRawEntity
import com.graphometrica.minenergo.backend.weather.repository.WeatherRawRepository
import com.opencsv.CSVReader
import org.springframework.stereotype.Service
import java.io.Reader
import java.nio.file.Files
import java.nio.file.Paths
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter


@Service
class CsvWeatherCrawlerService(
        val weatherRawRepository: WeatherRawRepository
) {

    val formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm")
    val fileNames = listOf("1", "17", "27", "36", "49", "58", "7", "80", "89", "97", "10", "18", "28", "37", "5", "60", "70", "81", "90", "98", "100", "19", "29", "38", "50", "61", "71", "82", "91", "99", "101", "20", "3", "4", "52", "63", "73", "83", "92", "11", "22", "32", "41", "53", "65", "75", "85", "93", "12", "24", "33", "42", "54", "66", "76", "86", "94", "14", "25", "34", "46", "56", "68", "78", "87", "95", "15", "26", "35", "47", "57", "69", "8", "88", "96")

    fun startCrawler() {
        var counter = 0
        fileNames.forEach {
            readAllExample(it)
            print("№${counter++} : $it")
        }

        println("Done!!!!!")
        println("Done!!!!!")
        println("Done!!!!!")
        println("Done!!!!!")
        println("Done!!!!!")
    }

    //@PostConstruct
    fun runthis() {
        startCrawler()
    }

    fun readAllExample(filename: String) {
        val reader: Reader = Files.newBufferedReader(Paths.get(
                ClassLoader.getSystemResource("csv/$filename").toURI()))
        readAll(reader, filename)
    }

    fun readAll(reader: Reader, filename: String) {
        val csvReader = CSVReader(reader)
        csvReader.skip(7)
        val subjectIdFromFilename = filename.toInt()
        var row = csvReader.readNext()
        var listOfRawWeather: List<WeatherRawEntity> = listOf()
        var lastDouble: Double = (0).toDouble()
        var lastTimeStamp: LocalDateTime = LocalDateTime.now()
        var counter = 0
        while (row != null) {
            val splittedRow = row[0].split(';')
            val rawTimestamp = splittedRow[0].replace(Regex("""["]"""), "")
            val rawTemp = splittedRow[1].replace(Regex("""["]"""), "")

            val localdatetime = localDateTimeFromString(rawTimestamp, lastTimeStamp)

            val doubleTemp = stringToDouble(rawTemp, lastDouble)

            //print("$localdatetime $doubleTemp\n")
            row = csvReader.readNext()
            listOfRawWeather = listOfRawWeather.plus(WeatherRawEntity().apply {
                subjectId = subjectIdFromFilename
                timestamp = localdatetime
                temp = doubleTemp
            })
            lastDouble = doubleTemp
            lastTimeStamp = localdatetime
        }

        weatherRawRepository.saveAll(listOfRawWeather)
    }

    fun localDateTimeFromString(raw: String, errorValue: LocalDateTime): LocalDateTime {
        return try {
            LocalDateTime.parse(raw, formatter)
        } catch (ex: Exception) {
            println("Error while read localdateime $raw, replaced with $errorValue")
            errorValue
        }
    }

    fun stringToDouble(raw: String, errorValue: Double): Double {
        return try {
            raw.toDouble()
        } catch (ex: Exception) {
            println("Error while read temp $raw, replaced with $errorValue")
            errorValue
        }
    }

}

