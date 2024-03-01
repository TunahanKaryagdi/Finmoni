package com.tunahankaryagdi.finmoni.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.tunahankaryagdi.finmoni.presentation.overview.overviewScreen


@Composable
fun NavigationHost(
    modifier: Modifier = Modifier,
    navController: NavHostController,
    startDestination: String
) {

    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = startDestination,
    ){

        overviewScreen()
    }
}