package com.mahmoud.tajaarandroid.presentation.authentication

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mahmoud.tajaarandroid.R
import com.mahmoud.tajaarandroid.presentation.authentication.components.ActionButton
import com.mahmoud.tajaarandroid.presentation.authentication.components.PaymentButton

@Composable
fun PaymentMethodScreen(
    modifier : Modifier = Modifier
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(rememberScrollState())
    ) {
        Text(
            modifier = Modifier
                .align(Alignment.TopEnd)
                .padding(top = 32.dp, end = 8.dp),
            text = "Skip",
            fontWeight = FontWeight.W400,
            color = MaterialTheme.colorScheme.onPrimary
        )
        Column(
            modifier = Modifier
                .fillMaxSize()
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
            Spacer(modifier = Modifier.height(32.dp))
            PaymentButton(
                resId = R.drawable.paypal,
                buttonText = "Paypal"
            )
            Spacer(modifier = Modifier.height(8.dp))
            PaymentButton(
                resId = R.drawable.western_union,
                buttonText = "Western Union"
            )
            Spacer(modifier = Modifier.height(8.dp))
            PaymentButton(
                resId = R.drawable.stripe,
                buttonText = "Stripe"
            )
            Spacer(modifier = Modifier.height(8.dp))
            PaymentButton(
                resId = R.drawable.shopify,
                buttonText = "Shopify"
            )
            Spacer(modifier = Modifier.height(8.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 38.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Divider(
                    modifier = Modifier.width(138.dp),
                    thickness = 1.dp,
                    color = Color.Black.copy(0.1f)
                )
                Text(
                    text = "OR",
                    fontSize = 10.sp
                )
                Divider(
                    modifier = Modifier.width(138.dp),
                    thickness = 1.dp,
                    color = Color.Black.copy(0.1f)
                )
            }
            Spacer(modifier = Modifier.height(16.dp))
            ActionButton(
                textButton = "Pick Later",
                containerColor = MaterialTheme.colorScheme.onSecondary,
                textColor = MaterialTheme.colorScheme.onPrimary
            )
        }
        ActionButton(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 16.dp),
            textButton = "Next",
            containerColor = MaterialTheme.colorScheme.onPrimary,
            textColor = MaterialTheme.colorScheme.onSecondary
        )
    }
}