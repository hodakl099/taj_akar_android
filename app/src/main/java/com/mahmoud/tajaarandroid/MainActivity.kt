package com.mahmoud.tajaarandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.mahmoud.tajaarandroid.presentation.onboarding.OnBoardingStepOne
import com.mahmoud.tajaarandroid.presentation.splash.SplashScreen
import com.mahmoud.tajaarandroid.presentation.util.Route.ONBOARDING_STEP_1
import com.mahmoud.tajaarandroid.presentation.util.Route.SPLASH
import com.mahmoud.tajaarandroid.ui.theme.TajAarAndroidTheme


class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            TajAarAndroidTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                ) { innerPadding ->
                    NavHost(navController = navController, startDestination = ONBOARDING_STEP_1 ) {
                        composable(SPLASH) {
                            SplashScreen(
                                modifier = Modifier.padding(innerPadding),
                                onNavigate =  {
                                    navController.navigate(ONBOARDING_STEP_1)
                                }
                            )
                        }
                        composable(ONBOARDING_STEP_1) {
                            Box(modifier = Modifier.fillMaxSize()) {
                                OnBoardingStepOne()
                            }
                        }
                    }

                }
            }
        }
    }
}

