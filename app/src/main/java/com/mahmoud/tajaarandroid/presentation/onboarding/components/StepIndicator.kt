package com.mahmoud.tajaarandroid.presentation.onboarding.components


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.mahmoud.tajaarandroid.ui.theme.ValentineRed

@Composable
fun StepIndicator(currentStep : Int) {
    Row(
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxWidth()
    ) {
        for (i in 0 until 3) {
            Spacer(modifier = Modifier.width(if (i > 0) 16.dp else 0.dp))
            Box(
                modifier = Modifier
                    .width(if (i == currentStep) 20.dp else 4.dp)
                    .height(4.dp)
                    .background(
                        if (i  == currentStep) ValentineRed else ValentineRed.copy(0.3f),
                        shape = CircleShape
                    )
            )
        }
    }
}