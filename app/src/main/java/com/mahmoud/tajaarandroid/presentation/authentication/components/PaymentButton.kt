package com.mahmoud.tajaarandroid.presentation.authentication.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun PaymentButton(
    resId : Int,
    buttonText : String
) {
    Button(
        modifier = Modifier
            .border(
                width = 1.dp,
                color = Color.Black.copy(0.1f),
                shape = RoundedCornerShape(14.dp)
            )
            .width(327.dp)
            .height(54.dp),
        onClick = { /*TODO*/ },
        colors = ButtonDefaults.buttonColors(
            containerColor = MaterialTheme.colorScheme.onSecondary
        ),
        shape = RoundedCornerShape(14.dp)
    ) {
        Row(
             modifier = Modifier.fillMaxWidth()
                 .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painter = painterResource(id = resId),
                contentDescription = buttonText,
                tint = Color.Unspecified
            )
            Spacer(modifier = Modifier.width(14.dp))
            Text(
                text = buttonText,
                fontSize = 14.sp,
                color = Color.Black.copy(0.6f),
                fontWeight = FontWeight.W400
            )
        }

    }
}