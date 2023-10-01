package com.mahmoud.tajaarandroid.presentation.onboarding

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
import com.mahmoud.tajaarandroid.R
import com.mahmoud.tajaarandroid.presentation.onboarding.components.BoardingBaseScreen
import com.mahmoud.tajaarandroid.presentation.onboarding.components.StepIndicator


@Composable
fun OnBoardingStepThree(
    modifier : Modifier = Modifier,
    onNavigate : () -> Unit,
    viewModel: OnBoardingViewModel
) {
    viewModel.onStepChange(2)
    BoardingBaseScreen(
        headerText = "A Premier \nReal Estate Professional.",
        image = R.drawable.ellipse3,
        onNavigate = onNavigate,
        viewModel = viewModel
    )
}
