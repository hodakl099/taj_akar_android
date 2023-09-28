package com.mahmoud.tajaarandroid.presentation.common_components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.mahmoud.tajaarandroid.R


@Composable
fun CustomActionIcon(
    iconRes: Int,
    hasWhiteBackground : Boolean = false,
    hasBorder : Boolean = false,
    backgroundColor : Color = Color.White
) {
    Box(
        modifier = Modifier
            .size(44.dp)
            .clip(RoundedCornerShape(10.dp))
            .border(
                width = if (hasBorder) 1.dp else 0.dp,
                color = Color(0xFFF9F9F9),
                shape = RoundedCornerShape(10.dp)
            )
            .background(if (hasWhiteBackground) backgroundColor  else Color(0xFFF9F9F9) )
    ) {
        IconButton(
            modifier = Modifier
                .fillMaxSize()
                .padding(10.dp),
            onClick = { /*TODO*/ }
        ) {
            Icon(
                painter = painterResource(id = iconRes),
                contentDescription = null,
                tint = Color.Unspecified
            )
        }
    }
}
