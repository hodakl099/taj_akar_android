package com.mahmoud.tajaarandroid.presentation.home.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableDoubleStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mahmoud.tajaarandroid.R

@Composable
fun CategoryItem(
    modifier : Modifier = Modifier,
    category : CategoryData
) {

    //TODO() remove the format to the viewmodel..
    var value =
        String.format("$%.2f", category.price)
    Column {
        Image(painter = painterResource(id = R.drawable.villa_image), contentDescription = null)
        Row(
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                modifier = Modifier.padding(12.dp),
                text = category.type,
                style = TextStyle(
                    fontSize = 10.sp,
                    fontWeight = FontWeight.W700,
                    color = MaterialTheme.colorScheme.onPrimary.copy(0.8f)
                )
            )
            Text(
                modifier = Modifier.padding(top = 12.dp),
                text = category.name,
                fontWeight = FontWeight.W700,
                fontSize = 14.sp,
            )
            Text(
                text = category.location,
                style = TextStyle(
                    fontWeight = FontWeight.W400,
                    fontSize = 9.sp,
                    color = Color.Black.copy(0.6f)
                )
            )
            Row(
                horizontalArrangement = Arrangement.SpaceAround,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = value,
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontWeight = FontWeight.W800,
                        color = Color.Red.copy(0.8f)
                    )
                )
            }
            Row {
                Icon(
                    painter = painterResource(id = R.drawable.star),
                    contentDescription = null
                )
                Text(
                    text = "4.9",
                    style = TextStyle(
                        fontSize = 10.sp,
                        fontWeight = FontWeight.W700,
                        color = Color(0xffF2994A).copy(0.2f)
                    )
                )
            }
        }
    }
}

// TODO() remove Category Data to data layer.
data class CategoryData(
    val type : String,
    val name : String,
    val location : String,
    val price : Double
)