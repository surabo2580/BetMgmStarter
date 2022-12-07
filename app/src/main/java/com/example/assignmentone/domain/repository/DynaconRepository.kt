package com.example.assignmentone.domain.repository

import com.example.assignmentone.data.dto.DynaconResponse
import com.example.assignmentone.domain.model.DynaconRequest

interface DynaconRepository {

    suspend fun getDynaconData(headers: Map<String,String>,dynaconRequest: DynaconRequest): DynaconResponse


}