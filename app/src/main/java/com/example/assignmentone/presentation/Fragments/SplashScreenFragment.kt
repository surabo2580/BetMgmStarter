package com.example.assignmentone.presentation.Fragments

import android.content.ContentValues.TAG
import android.os.Bundle
import android.os.Handler
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.ui.platform.ComposeView
import androidx.fragment.app.viewModels
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.viewModelScope
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import com.example.assignmentone.R
import com.example.assignmentone.di.DependencyModule
import com.example.assignmentone.domain.repository.DynaconRepository
import com.example.assignmentone.domain.usecase.dynaconUseCase.FetchDynaconDataUseCase
import com.example.assignmentone.presentation.SplashScreenView
import com.example.assignmentone.presentation.viewModel.SplashScreenViewModel
import com.example.assignmentone.presentation.viewModel.SplashScreenViewModelFactory
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
import javax.inject.Inject
@AndroidEntryPoint
class SplashScreenFragment : Fragment() {

    private val splashScreenViewModel: SplashScreenViewModel by viewModels()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return ComposeView(requireContext()).apply { setContent {
            SplashScreenView(

                navController = NavController(requireContext())
            )
        } }

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i(TAG, "000000:${splashScreenViewModel.dynaconResponseObserver} ")
        Log.i(TAG, "onViewCreated: +++++++++++")
        splashScreenViewModel.dynaconResponseObserver.observeForever {
            Log.i(TAG, "dynacon response: ${it.Entries} ")
        }
        Log.i(TAG, "xxxxxxxxx: ${splashScreenViewModel.getDynaconData().toString()}")

//        Log.i(TAG, "onViewCreated: ${dynaconApiUsecase.invoke()}")
        Handler().postDelayed({

//            val useCase = FetchDynaconDataUseCase()
//            splashscreenviewmodel=
//                ViewModelProvider(this@SplashScreenFragment, SplashScreenViewModelFactory())
//                    .get(SplashScreenViewModel::class.java)
//            splashscreenviewmodel..observe(viewLifecycleOwner, Observer{
//                Log.i("dynocon", it.Entries.toString())
//            })

            findNavController().navigate(R.id.action_splashScreenFragment_to_lobbyFragment)


            //           findNavController().popBackStack(R.id.firstFragment,false)

        }, 5000)


    }



}