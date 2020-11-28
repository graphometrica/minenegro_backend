package com.graphometrica.minenergo.backend

import com.graphometrica.minenergo.backend.pro.ProDataEntity
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface RegionDirectoryRepository : CrudRepository<RegionDirectoryEntity, Int> {
    fun findBySubjectId (subjectId: Int) : RegionDirectoryEntity
    fun findByPowerSystemId(powerSystemId: Int) : RegionDirectoryEntity
}