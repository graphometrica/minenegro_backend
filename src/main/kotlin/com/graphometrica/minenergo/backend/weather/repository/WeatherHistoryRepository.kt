package com.graphometrica.minenergo.backend.weather.repository

import com.graphometrica.minenergo.backend.weather.entity.WeatherHistoryEntity
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface WeatherHistoryRepository : CrudRepository<WeatherHistoryEntity, Int>