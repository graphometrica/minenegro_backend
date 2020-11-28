package com.graphometrica.minenergo.backend.weather.repository

import com.graphometrica.minenergo.backend.weather.entity.RegionDirectoryEntity
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface RegionDirectoryRepository : CrudRepository<RegionDirectoryEntity, Int> {
    fun findBySubjectId(subjectId: Int): RegionDirectoryEntity
    fun findByPowerSystemId(powerSystemId: Int): RegionDirectoryEntity
}