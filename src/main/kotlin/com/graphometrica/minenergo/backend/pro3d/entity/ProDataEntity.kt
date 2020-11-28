package com.graphometrica.minenergo.backend.pro3d.entity

import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity(name = "pro_data")
class ProDataEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int = 0

    @Column
    var timestamp: LocalDateTime = LocalDateTime.now()

    @Column
    var value: Double = (0).toDouble()

    @Column
    var powerSystemId: Int = 0

    @Column
    var name: String = ""
}