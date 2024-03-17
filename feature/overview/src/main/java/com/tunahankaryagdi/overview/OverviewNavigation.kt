package com.tunahankaryagdi.overview

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable

const val OVERVIEW_ROUTE = "overview"


fun NavController.navigateToOverview(
    navOptions: NavOptions? = null
){
    this.navigate(OVERVIEW_ROUTE,navOptions)
}

fun NavGraphBuilder.overviewScreen(){
    composable(OVERVIEW_ROUTE){
        OverviewScreenRoute()
    }
}