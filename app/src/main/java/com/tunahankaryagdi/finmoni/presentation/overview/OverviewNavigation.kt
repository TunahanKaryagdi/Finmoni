package com.tunahankaryagdi.finmoni.presentation.overview

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable


const val overviewRoute = "overview"

fun NavGraphBuilder.overviewScreen(){
    composable(overviewRoute){
        OverviewScreenRoute()
    }
}