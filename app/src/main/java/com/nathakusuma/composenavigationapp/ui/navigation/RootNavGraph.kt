package com.nathakusuma.composenavigationapp.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.navigation
import androidx.navigation.compose.composable
import com.nathakusuma.composenavigationapp.ui.screens.HomeScreen
import com.nathakusuma.composenavigationapp.ui.screens.SplashScreen

@Composable
fun RootNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = Routes.SPLASH
    ) {
        // 1) Splash sebagai start
        composable(Routes.SPLASH) {
            SplashScreen(
                onFinished = {
                    navController.navigate(Routes.MAIN_GRAPH) {
                        popUpTo(Routes.SPLASH) { inclusive = true }
                        launchSingleTop = true
                    }
                }
            )
        }

        // 2) Main graph
       composable(Routes.MAIN_GRAPH) {
           MainScaffold()
       }
    }
}
