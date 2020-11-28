package com.graphometrica.minenergo.backend.weather.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity(name = "region_directory")
class RegionDirectoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int = 0

    @Column
    var oes: String = ""

    @Column
    var name: String = ""

    @Column
    var subjectId: Int = 0

    @Column
    var powerSystemId: Int = 0

    @Column
    var proName: String = ""
}