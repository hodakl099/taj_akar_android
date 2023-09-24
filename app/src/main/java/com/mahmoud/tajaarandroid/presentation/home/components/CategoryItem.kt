package com.mahmoud.tajaarandroid.presentation.home.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.mahmoud.tajaarandroid.R

@Composable
fun CategoryItem(
    modifier : Modifier = Modifier,
    category : CategoryData
) {
    Column {
        Image(painter = painterResource(id = R.drawable.villa_image), contentDescription = null)
        Row(
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ) {

        }
    }
}

// TODO() remove Category Data to data layer.
data class CategoryData(
    val type : String,
    val name : String,
    val location : String,
    val price : String
)