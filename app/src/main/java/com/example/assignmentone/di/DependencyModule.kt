package com.example.assignmentone.di


import com.example.assignmentone.common.Constants
import com.example.assignmentone.data.Api.DynaconApi
import com.example.assignmentone.data.repository.DynaconRepositoryImpl
import com.example.assignmentone.domain.repository.DynaconRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import javax.inject.Singleton
import kotlin.text.Typography.dagger


@Module
@InstallIn(SingletonComponent::class)
object DependencyModule {

    @Provides
    @Singleton
    fun provideDynaconApi():DynaconApi{
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(DynaconApi::class.java)
    }

    @Provides
    @Singleton
    fun provideDynaconRepository(api:DynaconApi):DynaconRepository{
        return DynaconRepositoryImpl(api)
    }

}