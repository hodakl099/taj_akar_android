package com.mahmoud.tajaarandroid.presentation.authentication


import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mahmoud.tajaarandroid.R
import com.mahmoud.tajaarandroid.ui.theme.BlueLotus


@Composable
fun GetStartedScreen(
    modifier : Modifier = Modifier,
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(start = 32.dp, end = 32.dp, bottom = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            modifier = Modifier
                .width(400.dp)
                .height(400.dp),
            painter =  painterResource(id = R.drawable.rectangle3),
            contentDescription = null
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            modifier = Modifier.align(Alignment.Start),
            text = "Let’s Get",
            fontWeight = FontWeight.Bold,
            fontSize = 38.sp,
        )
        Text(
            modifier = Modifier.align(Alignment.Start),
            text = "Started",
            fontWeight = FontWeight.Bold,
            fontSize = 38.sp,
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            modifier = Modifier.align(Alignment.Start),
            text = "Lorem ipsum dolor sit amet,\nconsectetur adipiscing elit. Habitant",
            fontSize = 13.sp,
        )
        Spacer(modifier = Modifier.height(8.dp))
        Button(
            modifier = Modifier
                .width(327.dp)
                .height(54.dp),
            onClick = {  },
            shape = RoundedCornerShape(14.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = MaterialTheme.colorScheme.onPrimary
            )
        ) {
            Text(
                text = "Login",
                color = MaterialTheme.colorScheme.onSecondary
            )
        }
        Spacer(modifier = Modifier.height(8.dp))
        Button(
            modifier = Modifier
                .width(327.dp)
                .height(54.dp),
            onClick = {  },
            shape = RoundedCornerShape(14.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor =  MaterialTheme.colorScheme.onSecondary
            ),
            border = BorderStroke(
                width = 1.dp,
                color = BlueLotus.copy(0.2f)
            )
        ) {
            Text(
                text = "Sign Up",
                color = MaterialTheme.colorScheme.onPrimary,

            )
        }
    }
}