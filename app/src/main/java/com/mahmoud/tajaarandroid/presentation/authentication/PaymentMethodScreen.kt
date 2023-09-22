package com.mahmoud.tajaarandroid.presentation.authentication

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mahmoud.tajaarandroid.R
import com.mahmoud.tajaarandroid.presentation.authentication.components.PaymentButton

@Composable
fun PaymentMethodScreen(
    modifier : Modifier = Modifier
) {
    Box(
        modifier = modifier.fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            modifier = Modifier.align(Alignment.TopEnd)
                .padding(top = 32.dp, end = 8.dp),
            text = "Skip",
            fontWeight = FontWeight.W400,
            color = MaterialTheme.colorScheme.onPrimary
        )
        Column(
            modifier = Modifier.fillMaxSize()
                .padding(top = 64.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                modifier = Modifier
                    .align(Alignment.Start),
                text = "Payment Method",
                fontWeight = FontWeight.W800,
                fontSize = 28.sp,
            )
            Text(
                modifier = Modifier
                    .align(Alignment.Start)
                    .padding(top = 12.dp),
                text = "Lorem ipsum dolor sit amet,\nconsectetur adipiscing elit. Habitant",
                fontSize = 13.sp,
            )
            PaymentButton(
                resId = R.drawable.facebook,
                buttonText = "Paypal"
            )
        }
    }
}