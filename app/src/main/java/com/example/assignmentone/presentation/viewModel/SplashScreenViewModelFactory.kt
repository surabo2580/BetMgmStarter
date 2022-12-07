package com.example.assignmentone.presentation.viewModel

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.assignmentone.domain.repository.DynaconRepository
import com.example.assignmentone.domain.usecase.dynaconUseCase.FetchDynaconDataUseCase

class SplashScreenViewModelFactory(private val useCase: FetchDynaconDataUseCase):
    ViewModelProvider.NewInstanceFactory() {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return SplashScreenViewModel(useCase) as T
    }
}