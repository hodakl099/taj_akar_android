package com.mahmoud.tajaarandroid.presentation.home.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
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
import com.mahmoud.tajaarandroid.ui.theme.BlueLotus
import com.mahmoud.tajaarandroid.ui.theme.TextColor
import com.mahmoud.tajaarandroid.ui.theme.ValentineRed
import com.mahmoud.tajaarandroid.ui.theme.fadedOrange


@Composable
fun CategoryItem(
    modifier : Modifier = Modifier,
    category : CategoryData,
    onClick : () -> Unit = {}
) {

    //TODO() remove the format to the viewmodel..
    var value =
        String.format("$%.2f", category.price)
    Column(
        modifier = modifier.padding(bottom = 12.dp).clickable { onClick() },
        verticalArrangement = Arrangement.Center,
        horizontalAlignment =Alignment.Start,
    ) {
        Image(
            modifier = Modifier
                .fillMaxWidth(fraction = 1f)
                .aspectRatio(1.08f),
            painter = painterResource(id = R.drawable.villa_image),
            contentDescription = null
        )
        Spacer(modifier = Modifier.height(8.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = category.type,
                style = TextStyle(
                    fontSize = 10.sp,
                    fontWeight = FontWeight.W700,
                    color = BlueLotus.copy(0.8f)
                )
            )
            Icon(
                painter = painterResource(id = R.drawable.more),
                contentDescription = "More"
            )
        }
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = category.location,
            style = TextStyle(
                fontSize = 14.sp,
                fontWeight = FontWeight.W700,
                color = TextColor.copy(0.8f)
            )
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = category.address,
            style = TextStyle(
                fontSize = 9.sp,
                fontWeight = FontWeight.W400,
                color = TextColor.copy(0.6f)
            )
        )
        Spacer(modifier = Modifier.height(8.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = value,
                style = TextStyle(
                    fontSize = 14.sp,
                    fontWeight = FontWeight.W800,
                    color = ValentineRed.copy(0.8f)
                )
            )
            Row{
                Icon(
                    painter = painterResource(id = R.drawable.star),
                    contentDescription = null,
                    tint = Color.Unspecified
                )
                Text(
                    text = "4.9",
                    style = TextStyle(
                        fontSize = 10.sp,
                        fontWeight = FontWeight.W700,
                        color = fadedOrange.copy(0.2f)
                    )
                )
            }
        }
        Spacer(modifier = Modifier.height(8.dp))
    }
}

// TODO() remove Category Data to data layer.
data class CategoryData(
    val type : String,
    val address : String,
    val location : String,
    val price : Double
)