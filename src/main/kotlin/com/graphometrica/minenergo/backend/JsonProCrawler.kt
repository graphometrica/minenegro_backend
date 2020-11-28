package com.graphometrica.minenergo.backend

import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.graphometrica.minenergo.backend.pro.ProDataEntity
import com.graphometrica.minenergo.backend.pro.ProDataRepository
import org.springframework.stereotype.Service
import java.io.File
import java.io.Reader
import java.nio.file.Files
import java.nio.file.Paths
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.YearMonth
import java.time.format.DateTimeFormatter
import java.time.format.DateTimeFormatterBuilder
import java.time.temporal.ChronoField
import java.util.*
import javax.annotation.PostConstruct


@Service
class JsonProCrawler(
        val proDataRepository: ProDataRepository
) {

    val formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");

    val dataMap : Map<String, LocalDateTime> = mapOf(
            "2017, 1кв" to LocalDateTime.parse("01.01.2017 00:00", formatter),
            "2017, 2кв" to LocalDateTime.parse("01.04.2017 00:00", formatter),
            "2017, 3кв" to LocalDateTime.parse("01.07.2017 00:00", formatter),
            "2017, 4кв" to LocalDateTime.parse("01.10.2017 00:00", formatter),
            "2018, 1кв" to LocalDateTime.parse("01.01.2018 00:00", formatter),
            "2018, 2кв" to LocalDateTime.parse("01.04.2018 00:00", formatter),
            "2018, 3кв" to LocalDateTime.parse("01.07.2018 00:00", formatter),
            "2018, 4кв" to LocalDateTime.parse("01.10.2018 00:00", formatter),
            "2019, 1кв" to LocalDateTime.parse("01.01.2019 00:00", formatter),
            "2019, 2кв" to LocalDateTime.parse("01.04.2019 00:00", formatter),
            "2019, 3кв" to LocalDateTime.parse("01.07.2019 00:00", formatter),
            "2019, 4кв" to LocalDateTime.parse("01.10.2019 00:00", formatter),
            "2020, 1кв" to LocalDateTime.parse("01.01.2020 00:00", formatter),
            "2020, 2кв" to LocalDateTime.parse("01.04.2020 00:00", formatter),
            "2020, 3кв" to LocalDateTime.parse("01.07.2020 00:00", formatter),
            "2020, 4кв" to LocalDateTime.parse("01.10.2020 00:00", formatter),
    )

    var mapper = jacksonObjectMapper().apply {
        configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
    }

    fun readFile() {
        val paths = File("src/main/resources/pro_data").walk()
        paths.forEach { if (it.isFile && !it.isHidden)
            parseFile(it)
        }
    }

    fun parseFile(file: File) {
        val proModel = mapper.readValue(file, ProModel::class.java)
        val powerSystemIdDir = file.parentFile.name.toInt()
        proModel.lines.forEach { line ->
            line.points.forEach { point ->
                proDataRepository.save(ProDataEntity().apply {
                    timestamp = dataMap[point.x]?: LocalDateTime.now()
                    value = point.y
                    powerSystemId = powerSystemIdDir
                    name = line.name
                })
            }
        }
    }

    fun readText(path : String) : String {
        val reader: Reader = Files.newBufferedReader(Paths.get(
                ClassLoader.getSystemResource(path).toURI()))
        return reader.readText()
    }

    //@PostConstruct
    fun runThis() {
        readFile();
    }
}