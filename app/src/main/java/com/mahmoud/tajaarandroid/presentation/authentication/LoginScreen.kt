package com.mahmoud.tajaarandroid.presentation.authentication


import androidx.compose.foundation.Image
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
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mahmoud.tajaarandroid.R
import com.mahmoud.tajaarandroid.presentation.authentication.components.CustomTextField
import com.mahmoud.tajaarandroid.presentation.authentication.components.LoginButton


@Composable
fun LoginScreen(
    modifier : Modifier = Modifier
) {
    var dummyText by remember {
        mutableStateOf(TextFieldValue(""))
    }
    var isChecked by remember {
        mutableStateOf(false)
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
                .padding(top = 54.dp),
            text = "Login",
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
        CustomTextField(
            modifier = Modifier.padding(top = 38.dp),
            value = dummyText,
            onValueChange =  {
                dummyText = it
            },
            resourceId = R.drawable.sms,
            placeHolderText = "Email"
        )
        CustomTextField(
            modifier = Modifier.padding(top = 8.dp),
            value = dummyText,
            onValueChange =  {
                dummyText = it
            },
            resourceId = R.drawable.lock,
            placeHolderText = "Password",
            isPassword = true
        )
        Row(
            modifier = Modifier.padding(top = 16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Checkbox(
                modifier = Modifier.scale(0.6f),
                checked = isChecked,
                onCheckedChange = {
                                  isChecked = it
                },
                colors = CheckboxDefaults.colors(
                    checkedColor = Color(0xff27AE60),
                    checkmarkColor = Color.White
                )
            )
            Text(
                text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Habitant",
                fontSize = 10.sp,
                color = Color.Black.copy(0.6f)
            )
        }
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
        Spacer(modifier = Modifier.height(32.dp))
        LoginButton(
            resId = R.drawable.google,
            buttonText = "Google"
        )
        Spacer(modifier = Modifier.height(8.dp))
        LoginButton(
            resId = R.drawable.facebook,
            buttonText = "Facebook"
        )
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
                text = "Sign Up",
                fontSize = 12.sp,
                fontWeight = FontWeight.W700,
                color = MaterialTheme.colorScheme.onPrimary
            )
        }
    }
}