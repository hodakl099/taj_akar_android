package com.mahmoud.tajaarandroid.presentation.onboarding.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
import com.mahmoud.tajaarandroid.presentation.onboarding.OnBoardingViewModel


@Composable
fun BoardingBaseScreen(
    modifier: Modifier = Modifier,
    headerText : String,
    image : Int,
    onNavigate : () -> Unit,
    viewModel : OnBoardingViewModel,
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .padding(top = 42.dp, end = 16.dp)
    ) {
        Text(
            modifier = Modifier
                .align(Alignment.TopEnd)
                .clickable { onNavigate() },
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
                painter = painterResource(id = image),
                contentDescription = null,
            )
            Text(
                modifier = Modifier.padding(horizontal = 71.dp),
                text = headerText,
                fontWeight = FontWeight.Bold,
                style = TextStyle(
                    fontSize = 28.sp,
                    textAlign = TextAlign.Center
                )
            )
            Button(
                modifier = Modifier
                    .width(193.dp)
                    .height(54.dp),
                onClick = onNavigate,
                shape = RoundedCornerShape(14.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = MaterialTheme.colorScheme.onPrimary
                )
            ) {
                Text(
                    color = MaterialTheme.colorScheme.onSecondary,
                    text = "Next"
                )
            }
            StepIndicator(
                viewModel.currentStep
            )
        }
    }
}