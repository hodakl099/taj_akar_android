package com.mahmoud.tajaarandroid.presentation.home.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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
fun HomeHeader(
    modifier: Modifier = Modifier,
    imageRes : Int,
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(top = 54.dp, start = 24.dp, end = 24.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
    ){
        Row(
            modifier = Modifier
                .width(174.dp)
                .height(44.dp)
                .background(
                    color = Color(0xffF9F9F9),
                    shape = RoundedCornerShape(10.dp)
                )
                .padding(8.dp),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ){
            Icon(
                painter = painterResource(id = R.drawable.location),
                contentDescription = "Location",
                tint = Color.Unspecified
            )
            Text(
                text = "Tripoli, Libya",
                style = TextStyle(
                    fontSize = 12.sp,
                    fontWeight = FontWeight.W400,
                    color = Color.Black.copy(0.8f)
                )
            )
        }
        Image(
            modifier =Modifier.size(44.dp),
            painter = painterResource(id = imageRes),
            contentDescription = "women"
        )
    }

}