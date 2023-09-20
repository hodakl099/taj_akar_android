package com.mahmoud.tajaarandroid.presentation.onboarding.components

import android.widget.Space
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

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
                        if (i  == currentStep) Color.Blue else Color.Gray,
                        shape = CircleShape
                    )
            )
        }
    }

}