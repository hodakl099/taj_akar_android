package com.mahmoud.tajaarandroid.navigation_graph

import androidx.annotation.DrawableRes
import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.mahmoud.tajaarandroid.R
import com.mahmoud.tajaarandroid.presentation.home.HomeScreen
import com.mahmoud.tajaarandroid.presentation.saved.SavedCategoriesScreen
import com.mahmoud.tajaarandroid.presentation.search.SearchScreen
import com.mahmoud.tajaarandroid.presentation.util.Route
import com.mahmoud.tajaarandroid.presentation.util.Route.CHAT
import com.mahmoud.tajaarandroid.presentation.util.Route.HOME
import com.mahmoud.tajaarandroid.presentation.util.Route.SAVED
import com.mahmoud.tajaarandroid.presentation.util.Route.SEARCH
import com.mahmoud.tajaarandroid.ui.theme.BlueLotus


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeGraph() {
    val navController = rememberNavController()
    val items = listOf(
        BottomNavItem.Home,
        BottomNavItem.Search,
        BottomNavItem.Saved,
        BottomNavItem.Chat
    )

    Scaffold(
        bottomBar = {
            BottomNavigation(
                backgroundColor = Color.White
            ) {
                val navBackStackEntry by navController.currentBackStackEntryAsState()
                val currentDestination = navBackStackEntry?.destination?.route
                items.forEach { screen ->
                    BottomNavigationItem(
                        icon = {
                            Icon(
                                painter = painterResource(id = screen.icon),
                                contentDescription = screen.route,
                                tint = if (currentDestination == screen.route) BlueLotus else Color.Unspecified
                            )
                               },
                        selected = currentDestination == screen.route,
                        onClick = {
                            if (currentDestination != screen.route) {
                                navController.navigate(screen.route) {
                                    launchSingleTop = true
                                }
                            }
                        }
                    )
                }
            }
        }
    ) { innerPadding ->

        NavHost(navController, startDestination = HOME) {
            composable(
                route = HOME,
                enterTransition = {
                    slideIntoContainer(
                        AnimatedContentTransitionScope.SlideDirection.Right,
                        animationSpec = tween(500)
                    )
                },
                exitTransition = {
                    slideOutOfContainer(
                        AnimatedContentTransitionScope.SlideDirection.Left,
                        animationSpec = tween(500)
                    )
                }
            ) {
                HomeScreen(innerPadding = innerPadding, navController = navController)
            }
            composable(
               route = SEARCH,
                enterTransition = {
                    slideIntoContainer(
                        AnimatedContentTransitionScope.SlideDirection.Right,
                        animationSpec = tween(500)
                    )
                },
                exitTransition = {
                    slideOutOfContainer(
                        AnimatedContentTransitionScope.SlideDirection.Left,
                        animationSpec = tween(500)
                    )
                }
            ) {
                SearchScreen()
            }
            composable(
                route = SAVED,
                enterTransition = {
                    slideIntoContainer(
                        AnimatedContentTransitionScope.SlideDirection.Right,
                        animationSpec = tween(500)
                    )
                },
                exitTransition = {
                    slideOutOfContainer(
                        AnimatedContentTransitionScope.SlideDirection.Left,
                        animationSpec = tween(500)
                    )
                }
            ) {
                SavedCategoriesScreen()
            }
            composable(
                route = CHAT,
                enterTransition = {
                    slideIntoContainer(
                        AnimatedContentTransitionScope.SlideDirection.Right,
                        animationSpec = tween(500)
                    )
                },
                exitTransition = {
                    slideOutOfContainer(
                        AnimatedContentTransitionScope.SlideDirection.Left,
                        animationSpec = tween(500)
                    )
                }
            ) {
                Box(modifier = Modifier.fillMaxSize()) {
                    Text(
                        modifier = Modifier.align(Alignment.Center),
                        text = "CHAT is coming soon!"
                    )
                }
            }
        }
    }
}

sealed class BottomNavItem(val route: String, @DrawableRes val icon: Int) {
    object Home : BottomNavItem(route = HOME,icon =  R.drawable.home)
    object Search : BottomNavItem(route = SEARCH,icon =  R.drawable.search)
    object Saved : BottomNavItem(route = Route.SAVED,icon =  R.drawable.saved)
    object Chat: BottomNavItem(route = Route.CHAT,icon =  R.drawable.messages)
}
