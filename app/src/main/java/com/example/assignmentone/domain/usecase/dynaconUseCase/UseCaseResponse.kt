package com.example.assignmentone.domain.usecase.dynaconUseCase

interface UseCaseResponse<Type> {

    fun onSuccess(result: Type)


}