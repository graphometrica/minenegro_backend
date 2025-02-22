package com.graphometrica.minenergo.backend.weather.entity

import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity(name = "weather_history")
class WeatherHistoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int = 0

    @Column
    var subjectId: Int = 0

    @Column
    var timestamp: LocalDateTime = LocalDateTime.now()

    @Column
    var middleTemp: Double = (0).toDouble()
}