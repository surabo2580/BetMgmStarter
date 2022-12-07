package com.example.assignmentone.presentation.ComposeView

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.assignmentone.R


data class User(
    val id:Int
)
val users = listOf(
    User(1),
    User(1),User(1),User(1),User(1),User(1),User(1),User(1),User(1),User(1),
)

@Composable
fun SportsScreenView() {
    LazyRow{
        items(users){ user ->
            UserCard()


        }
    }
}


@Composable
fun UserCard() {
    Card(
        elevation = 4.dp,
        modifier = Modifier
            .padding(12.dp)
            .fillMaxWidth()
            .wrapContentHeight()

    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .padding(12.dp)

        ){
            Image(painter = painterResource(id = R.drawable.ic_launcher_background),
                contentDescription ="",
                modifier = Modifier
                    .size(120.dp)
                    .clip(CircleShape)
            )
        }
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "details",
                fontSize = 12.sp,
                color = Color.Gray,
                modifier = Modifier.padding(12.dp))
            Button(onClick = {
                //
            }) {
                Text(text = "view Profile")
            }

        }

    }

}