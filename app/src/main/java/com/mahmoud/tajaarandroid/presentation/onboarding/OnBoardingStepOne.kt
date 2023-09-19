package com.mahmoud.tajaarandroid.presentation.onboarding

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
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


@Composable
fun OnBoardingStepOne(
    modifier : Modifier = Modifier
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .padding(top = 42.dp, end = 16.dp)
    ) {
        Text(
            modifier = Modifier.align(Alignment.TopEnd),
            text = "Skip"
        )
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            Image(
                modifier = Modifier.size(275.dp),
                painter = painterResource(id = R.drawable.ellipse1),
                contentDescription = null,
            )
            Text(
                modifier = Modifier.padding(horizontal = 71.dp),
                text = "Our reputation is as solid as concrete.",
                fontWeight = FontWeight.Bold,
                style = TextStyle(
                    fontSize = 28.sp,
                    textAlign = TextAlign.Center
                )
            )
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Next")
            }
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Next")
            }
        }
    }
 }
