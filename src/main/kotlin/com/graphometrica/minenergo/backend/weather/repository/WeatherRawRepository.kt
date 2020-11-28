package com.graphometrica.minenergo.backend.weather.repository

import com.graphometrica.minenergo.backend.weather.entity.WeatherRawEntity
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import java.time.LocalDateTime

@Repository
interface WeatherRawRepository : CrudRepository<WeatherRawEntity, Int> {
    fun findBySubjectIdAndAndTimestamp(subjectId: Int, timestamp: LocalDateTime): WeatherRawEntity?
}