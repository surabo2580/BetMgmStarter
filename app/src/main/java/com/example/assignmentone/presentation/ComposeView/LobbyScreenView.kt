package com.example.assignmentone.presentation.ComposeView

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp

import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.assignmentone.presentation.AppBottomNavigation
import com.example.assignmentone.presentation.AppTopNavigation
import com.example.assignmentone.presentation.navigation.NAV_ACCOUNT
import com.example.assignmentone.presentation.navigation.NAV_CASINO
import com.example.assignmentone.presentation.navigation.NAV_PROMOTIONS
import com.example.assignmentone.presentation.navigation.NAV_SPORTS
import androidx.navigation.fragment.findNavController
import com.example.assignmentone.presentation.Fragments.LobbyFragment
import androidx.navigation.fragment.findNavController


@Composable
fun LobbyScreenView(){
    val navController = rememberNavController()
    Scaffold(
        bottomBar = { AppBottomNavigation(navController = navController) },
        topBar = { AppTopNavigation(navController = navController) },
        drawerContent = { Text(text = "Drawer") }
    ) {


        NavHost(navController = navController, startDestination = NAV_SPORTS) {
            composable(NAV_SPORTS) { SportsScreenView() }
            composable(NAV_CASINO) { CasinoScreenView() }
            composable(NAV_PROMOTIONS) { PromotionScreenView() }
            composable(NAV_ACCOUNT) { AccountScreenView() }
        }
    }


}

@Composable
fun AppScreen(text: String) = Surface(modifier = Modifier.fillMaxSize()) {
    Text(text = text, fontSize = 32.sp)
}
