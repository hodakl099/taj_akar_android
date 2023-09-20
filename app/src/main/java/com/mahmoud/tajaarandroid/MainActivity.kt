package com.mahmoud.tajaarandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.mahmoud.tajaarandroid.presentation.onboarding.OnBoardingStepOne
import com.mahmoud.tajaarandroid.presentation.onboarding.OnBoardingStepThree
import com.mahmoud.tajaarandroid.presentation.onboarding.OnBoardingStepTwo
import com.mahmoud.tajaarandroid.presentation.onboarding.OnBoardingViewModel
import com.mahmoud.tajaarandroid.presentation.splash.SplashScreen
import com.mahmoud.tajaarandroid.presentation.util.Route.ONBOARDING_STEP_1
import com.mahmoud.tajaarandroid.presentation.util.Route.ONBOARDING_STEP_2
import com.mahmoud.tajaarandroid.presentation.util.Route.ONBOARDING_STEP_3
import com.mahmoud.tajaarandroid.presentation.util.Route.SPLASH
import com.mahmoud.tajaarandroid.ui.theme.TajAarAndroidTheme
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val viewModel = hiltViewModel<OnBoardingViewModel>()
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
                                OnBoardingStepOne(
                                    onNavigate = {
                                        viewModel.nextStep()
                                        navController.navigate(ONBOARDING_STEP_2)
                                    },
                                    viewModel = viewModel
                                )
                        }
                        composable(ONBOARDING_STEP_2) {
                            OnBoardingStepTwo(
                                viewModel = viewModel,
                                onNavigate = {
                                    viewModel.nextStep()
                                    navController.navigate(ONBOARDING_STEP_3)
                                }
                            )
                        }
                        composable(ONBOARDING_STEP_3) {
                            OnBoardingStepThree(
                                viewModel = viewModel,
                                onNavigate = {}
                            )
                        }
                    }

                }
            }
        }
    }
}

