package com.graphometrica.minenergo.backend

import java.sql.Timestamp
import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity(name = "weather_raw")
class WeatherRawEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id : Int = 0

    @Column
    var subjectId : Int = 0

    @Column
    var timestamp : LocalDateTime = LocalDateTime.now()

    @Column
    var temp : Double = (0).toDouble()
}