package com.mahmoud.tajaarandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.hilt.navigation.compose.hiltViewModel
import com.mahmoud.tajaarandroid.navigation_graph.AppNavigator
import com.mahmoud.tajaarandroid.presentation.onboarding.OnBoardingViewModel
import com.mahmoud.tajaarandroid.ui.theme.TajAarAndroidTheme
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val onBoardingViewModel = hiltViewModel<OnBoardingViewModel>()
            TajAarAndroidTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    containerColor = Color.White
                ) { innerPadding ->
                    AppNavigator(
                       onBoardingViewModel = onBoardingViewModel,
                        innerPadding = innerPadding
                    )
                }
            }
        }
    }
}


