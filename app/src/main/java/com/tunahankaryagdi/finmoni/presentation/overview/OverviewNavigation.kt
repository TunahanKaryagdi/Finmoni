package com.tunahankaryagdi.finmoni.presentation.overview

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable


const val overviewRoute = "overview"


fun NavController.navigateToOverview(
    navOptions: NavOptions? = null
){
    this.navigate(overviewRoute,navOptions)
}

fun NavGraphBuilder.overviewScreen(){
    composable(overviewRoute){
        OverviewScreenRoute()
    }
}