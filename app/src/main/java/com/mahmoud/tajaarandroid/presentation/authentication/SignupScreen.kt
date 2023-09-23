package com.mahmoud.tajaarandroid.presentation.authentication

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mahmoud.tajaarandroid.R
import com.mahmoud.tajaarandroid.presentation.authentication.components.CustomTextField

@Composable
fun SignupScreen(
    modifier : Modifier = Modifier
) {
    var dummyText by remember {
        mutableStateOf(TextFieldValue(""))
    }
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(start = 32.dp, end = 32.dp, bottom = 16.dp)
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            modifier = Modifier
                .width(326.dp)
                .height(97.dp),
            painter = painterResource(
                id = R.drawable.rectanglecrop),
            contentDescription = null
        )
        Text(
            modifier = Modifier
                .align(Alignment.Start)
                .padding(top = 32.dp),
            text = "Sign Up",
            fontWeight = FontWeight.Bold,
            fontSize = 28.sp,
        )
        Text(
            modifier = Modifier
                .align(Alignment.Start)
                .padding(top = 12.dp),
            text = "Lorem ipsum dolor sit amet,\nconsectetur adipiscing elit. Habitant",
            fontSize = 13.sp,
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp),
            horizontalArrangement = Arrangement.SpaceEvenly,
        ) {
            Button(
                modifier = Modifier
                    .width(103.dp)
                    .height(59.dp)
                    .border(
                        width = 1.dp,
                        color = Color.Black.copy(0.1f),
                        shape = RoundedCornerShape(14.dp)
                    ),
                shape = RoundedCornerShape(14.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = MaterialTheme.colorScheme.onSecondary
                ),
                onClick = { /*TODO*/ }
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.google),
                    contentDescription = "Google",
                    tint = Color.Unspecified
                )
            }
            Button(
                modifier = Modifier
                    .width(103.dp)
                    .height(59.dp)
                    .border(
                        width = 1.dp,
                        color = Color.Black.copy(0.1f),
                        shape = RoundedCornerShape(14.dp)
                    ),
                shape = RoundedCornerShape(14.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = MaterialTheme.colorScheme.onSecondary
                ),
                onClick = { /*TODO*/ }
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.facebook),
                    contentDescription = "Facebook",
                    tint = Color.Unspecified
                    )
            }
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp),
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
        CustomTextField(
            modifier = Modifier.padding(top = 8.dp),
            value = dummyText,
            onValueChange =  {
                dummyText = it
            },
            resourceId = R.drawable.sms,
            placeHolderText = "Email ID",
        )
        CustomTextField(
            modifier = Modifier.padding(top = 8.dp),
            value = dummyText,
            onValueChange =  {
                dummyText = it
            },
            resourceId = R.drawable.lock,
            placeHolderText = "Password",
        )
        CustomTextField(
            modifier = Modifier.padding(top = 8.dp),
            value = dummyText,
            onValueChange =  {
                dummyText = it
            },
            resourceId = R.drawable.sms,
            placeHolderText = "Full name",
        )
        CustomTextField(
            modifier = Modifier.padding(top = 8.dp),
            value = dummyText,
            onValueChange =  {
                dummyText = it
            },
            resourceId = R.drawable.lock,
            placeHolderText = "Repeat Password",
        )
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            modifier = Modifier
                .width(327.dp)
                .height(54.dp),
            onClick = {  },
            shape = RoundedCornerShape(14.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor =  MaterialTheme.colorScheme.onPrimary
            ),
        ) {
            Text(
                text = "Sign Up",
                color = MaterialTheme.colorScheme.onSecondary,
                )
        }
        Spacer(modifier = Modifier.height(16.dp))
        Row (
            verticalAlignment = Alignment.CenterVertically
        ){
            Text(
                text = "Don’t have an account?",
                fontSize = 12.sp,
                fontWeight = FontWeight.W400
            )
            Spacer(modifier = Modifier.width(4.dp))
            Text(
                text = "Login",
                fontSize = 12.sp,
                fontWeight = FontWeight.W700,
                color = MaterialTheme.colorScheme.onPrimary
            )
        }
    }
}