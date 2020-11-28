package com.graphometrica.minenergo.backend

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface WeatherHistoryRepository : CrudRepository<WeatherHistoryEntity, Int>