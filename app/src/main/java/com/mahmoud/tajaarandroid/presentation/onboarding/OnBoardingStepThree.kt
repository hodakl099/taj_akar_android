package com.mahmoud.tajaarandroid.presentation.onboarding

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mahmoud.tajaarandroid.R
import com.mahmoud.tajaarandroid.presentation.onboarding.components.StepIndicator


@Composable
fun OnBoardingStepThree(
    modifier : Modifier = Modifier,
    onNavigate : () -> Unit,
    viewModel: OnBoardingViewModel
) {
    viewModel.onStepChange(2)
    Box(
        modifier = modifier
            .fillMaxSize()
            .padding(top = 42.dp, end = 16.dp)
    ) {
        Text(
            modifier = Modifier.align(Alignment.TopEnd).clickable { onNavigate() },
            text = "Skip",
            color = MaterialTheme.colorScheme.onPrimary
        )
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            Image(
                modifier = Modifier.size(275.dp),
                painter = painterResource(id = R.drawable.ellipse2),
                contentDescription = null,
            )
            Text(
                modifier = Modifier.padding(horizontal = 71.dp),
                text = "A Premier \nReal Estate Professional.",
                fontWeight = FontWeight.Bold,
                style = TextStyle(
                    fontSize = 28.sp,
                    textAlign = TextAlign.Center
                )
            )
            Button(onClick = onNavigate) {
                Text(
                    text = "Next",
                    color = MaterialTheme.colorScheme.onSecondary
                )
            }
            StepIndicator(
                viewModel.currentStep
            )
        }
    }

}
