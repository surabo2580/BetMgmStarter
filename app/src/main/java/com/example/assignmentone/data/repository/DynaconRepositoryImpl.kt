package com.example.assignmentone.data.repository

import com.example.assignmentone.data.Api.DynaconApi
import com.example.assignmentone.data.dto.DynaconResponse
import com.example.assignmentone.domain.model.DynaconRequest
import com.example.assignmentone.domain.repository.DynaconRepository
import javax.inject.Inject

class DynaconRepositoryImpl @Inject constructor(
    private val api: DynaconApi
) : DynaconRepository {



   override suspend fun getDynaconData(headers: Map<String, String>, dynaconRequest: DynaconRequest):DynaconResponse{
        return api.getDynaconData(headers,dynaconRequest)
   }
}