package com.mahmoud.tajaarandroid.presentation.forgotpassword

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mahmoud.tajaarandroid.R
import com.mahmoud.tajaarandroid.presentation.authentication.components.ActionButton
import com.mahmoud.tajaarandroid.presentation.authentication.components.CustomTextField

@Composable
fun ForgotPasswordScreen(
    modifier : Modifier = Modifier
) {

    var dummyText by remember {
        mutableStateOf(TextFieldValue(""))
    }
        Column(
            modifier = modifier
                .fillMaxSize()
                .padding(horizontal = 24.dp)
                .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            IconButton(
                modifier = Modifier
                    .padding(top = 48.dp)
                    .size(44.dp)
                    .clip(RoundedCornerShape(10.dp))
                    .align(Alignment.Start)
                    .border(
                        width = 0.dp,
                        color = Color.Unspecified,
                        shape = RoundedCornerShape(10.dp)
                    ),
                colors = IconButtonDefaults.iconButtonColors(
                    containerColor = Color(0xFFF9F9F9)
                ),
                onClick = { /*TODO*/ }
            ) {
                Icon(
                    modifier = Modifier.size(14.dp),
                    painter = painterResource(id = R.drawable.arrowleft),
                    contentDescription = null
                )
            }
            Image(
                modifier = Modifier
                    .padding(top = 16.dp)
                    .width(327.dp)
                    .height(237.dp),
                painter = painterResource(
                id = R.drawable.forgotpasswordimg),
                contentDescription = null
            )
            Text(
                modifier = Modifier
                    .padding(top = 16.dp)
                    .align(Alignment.Start),
                text = "Forgot your\npassword",
                style = TextStyle(
                    fontSize = 38.sp,
                    fontWeight = FontWeight.W800,
                    textAlign = TextAlign.Start,
                    lineHeight = 46.sp
                ),
                color = Color.Black.copy(0.8f)
            )
            Text(
                modifier = Modifier
                    .align(Alignment.Start)
                    .padding(top = 10.dp),
                text = "Lorem ipsum dolor sit amet,\nconsectetur adipiscing elit. Habitant",
                fontSize = 13.sp,
                fontWeight = FontWeight.W400,
                color = Color.Black.copy(0.8f)
            )
            CustomTextField(
                modifier = Modifier.padding(top = 16.dp),
                value =dummyText ,
                onValueChange = {
                                dummyText = it
                },
                placeHolderText = "Your Email",
                resourceId = R.drawable.sms
            )
            Spacer(modifier = Modifier.height(32.dp))
            ActionButton(
                modifier = Modifier
                    .padding(bottom = 16.dp),
                textButton = "Next",
                containerColor = MaterialTheme.colorScheme.onPrimary,
                textColor = MaterialTheme.colorScheme.onSecondary
            )
            Spacer(modifier = Modifier.height(8.dp))
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