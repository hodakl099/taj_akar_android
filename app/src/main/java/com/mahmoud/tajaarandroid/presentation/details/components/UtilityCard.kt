package com.mahmoud.tajaarandroid.presentation.details.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mahmoud.tajaarandroid.ui.theme.TextColor
import com.mahmoud.tajaarandroid.ui.theme.cloud


@Composable
fun UtilityCard(
    modifier: Modifier = Modifier,
    utilityText: String,
    utilityIcon: Int,
    utilityDistance: String
) {
    Box(
        modifier = modifier
            .padding(top = 8.dp)
            .clip(RoundedCornerShape(10.dp))
            .background(cloud.copy(0.1f))
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    painter = painterResource(id = utilityIcon),
                    contentDescription = utilityText,
                    tint = Color.Unspecified
                )
                Spacer(modifier = Modifier.width(16.dp))
                Text(
                    text = utilityText,
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontWeight = FontWeight.W700,
                        color = TextColor.copy(0.8f)
                        )
                )
            }
            Text(
                text = utilityDistance,
                style = TextStyle(
                    fontSize = 10.sp,
                    fontWeight = FontWeight.W400,
                    color = TextColor.copy(0.6f)
                )
            )
        }
    }
}