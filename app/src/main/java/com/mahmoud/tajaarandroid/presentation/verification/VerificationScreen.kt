package com.mahmoud.tajaarandroid.presentation.verification

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mahmoud.tajaarandroid.R
import com.mahmoud.tajaarandroid.presentation.authentication.components.ActionButton
import com.mahmoud.tajaarandroid.presentation.authentication.components.CustomTextField

@Composable
fun VerificationScreen(
    modifier : Modifier = Modifier
) {

    var dummyText by remember {
        mutableStateOf(TextFieldValue(""))
    }

        Column(
            modifier = modifier
                .fillMaxSize()
                .padding(horizontal = 24.dp),
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
                text = "Verification\npassword",
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
            Row(
                horizontalArrangement = Arrangement.spacedBy(16.dp), // Adjust the spacing between TextFields as needed
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                val focusRequesters = List(4) { FocusRequester() }
                val textFields = remember { mutableStateListOf("", "", "", "") }

                val isFocused = remember { mutableStateOf(false) }

                textFields.forEachIndexed { index, text ->
                    Box (
                        modifier = Modifier
                            .size(67.dp)
                            .clip(RoundedCornerShape(14.dp))
                            .background(Color.Gray.copy(alpha = 0.1f))
                    ){
                        BasicTextField(
                            value = text,
                            onValueChange = {
                                if (it.length <= 1) {
                                    textFields[index] = it
                                    if (it.isNotEmpty() && index < 3) focusRequesters[index + 1].requestFocus()
                                }
                            },
                            keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Number),
                            textStyle = TextStyle(
                                textAlign = TextAlign.Center,
                                fontSize = 20.sp,
                                color = Color.Black
                            ),
                            modifier = Modifier
                                .align(Alignment.Center)
                                .focusRequester(focusRequesters[index])
                                .onFocusChanged { state ->
                                    isFocused.value = state.isFocused
                                }
                        )
                    }
                    LaunchedEffect(isFocused.value) {
                        if (isFocused.value && textFields[index].isNotEmpty() && index < 3) {
                            focusRequesters[index + 1].requestFocus()
                        }
                    }
                }
            }
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