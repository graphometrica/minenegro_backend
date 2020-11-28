package com.graphometrica.minenergo.backend.pro3d.repository

import com.graphometrica.minenergo.backend.pro3d.entity.ProDataEntity
import org.springframework.data.repository.CrudRepository

interface ProDataRepository : CrudRepository<ProDataEntity, Int>