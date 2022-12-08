package com.example.assignmentone.presentation.ComposeView

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

val books = (1..10).map { "Book $it" }.toList()
val wishlisted = (1..50).map { "Wishlisted Book $it" }

@Composable
fun CasinoScreenView() {
    LazyColumn(

        modifier = Modifier
            .background(Color.Black)
            .fillMaxSize(),
    ) {
        // My Books section
        item {
            Column(modifier = Modifier.fillMaxWidth()) {
                LazyRow {
                    items(users) { user ->
                        GameEventCard()


                    }
                }
            }

        }


        // Turning the list in a list of lists of two elements each
        items(users.windowed(1, 1, true)) { sublist ->
            Row(Modifier.fillMaxWidth()) {
                sublist.forEach { item ->
                    GameDetailsCard()
                }
            }
        }
        item {
            Column(
                modifier = Modifier.fillMaxWidth().padding(bottom = 60.dp).wrapContentSize()
            ) {
                LazyRow {
                    items(users) { user ->
                        GameEventCard()


                    }
                }
            }

        }


    }

}