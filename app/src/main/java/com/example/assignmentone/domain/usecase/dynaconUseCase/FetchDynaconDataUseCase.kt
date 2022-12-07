package com.example.assignmentone.domain.usecase.dynaconUseCase

import android.content.ContentValues.TAG
import android.util.Log
import com.example.assignmentone.common.Resource
import com.example.assignmentone.data.dto.DynaconResponse
import com.example.assignmentone.domain.model.DynaconRequest
import com.example.assignmentone.domain.model.EntriesRequest
import com.example.assignmentone.domain.repository.DynaconRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import java.text.MessageFormat
import javax.inject.Inject

class FetchDynaconDataUseCase @Inject constructor(private val repository: DynaconRepository) {


     suspend fun postDynaconData(): DynaconResponse {

        val headers = mapOf(
            "x-bwin-accessId" to "NWE1MzNhNjMtMTc5NC00ZTU2LWFkNmMtMTJiMjUyZDk5ZTVl",
            "Accept" to "application/json",
            "Content-Type" to "application/json")

        val entriesRequest= EntriesRequest("DYNACON_CONFIG", "Common.svc/Configuration/SW:1?env=devprod", "GET")
        val locationRequest=EntriesRequest("GEOLOCATION_DATA", "GeoLocation.svc/IP/", "GET")
        val entriesArray= arrayListOf<EntriesRequest>(entriesRequest,locationRequest)
        val dynaconRequest =DynaconRequest(entriesArray)


        return repository.getDynaconData(headers,dynaconRequest)
    }
}


//    operator fun invoke(): Flow<Resource<DynaconResponse>> = flow{
//        try {
//            emit(Resource.Loading())
//            val dynaconData = repository.getDynaconData(headers, dynaconRequest)
//            emit(Resource.Success(dynaconData))
//            Log.i(TAG, "invoke: $dynaconData ")
//        }catch (e: HttpException){
//            emit(Resource.Error(e.localizedMessage?:"An unexpected error occured"))
//        }catch (e: IOException){
//            emit(Resource.Error("could'nt reach server"))
//        }
//    }
//}