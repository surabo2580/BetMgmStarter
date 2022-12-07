package com.example.assignmentone.presentation

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.sp

@Composable
fun AppTopNavigation(navController: NavController){
    Column(

        Modifier
            .background(Color.Black)
            .fillMaxWidth()
    ) {
        Row() {
            Text(
                color = colorResource(id = com.example.assignmentone.R.color.dark_gold),
                text = "BET",
                fontSize = 20.sp
            )
            Text(
                color = colorResource(id = com.example.assignmentone.R.color.gold),
                text = "MGM",
                fontSize = 20.sp
            )
            Button(

                modifier = Modifier
                    .padding(start = 110.dp),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.Black,
                    contentColor = Color.White),
                border = BorderStroke(2.dp,Color.White),

                onClick = { /*TODO*/ }
            ) {
                Text(text = "Login")
            }

            Button(

                modifier = Modifier
                    .padding(start = 20.dp),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = colorResource(id = com.example.assignmentone.R.color.gold),
                    contentColor = Color.Black),
                border = BorderStroke(2.dp,Color.White),

                onClick = { /*TODO*/ }
            ) {
                Text(text = "Register")
            }



        }

    }

}