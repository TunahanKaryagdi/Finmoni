package com.tunahankaryagdi.finmoni.presentation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navOptions
import com.tunahankaryagdi.finmoni.presentation.overview.navigateToOverview
import com.tunahankaryagdi.finmoni.presentation.overview.overviewRoute
import com.tunahankaryagdi.finmoni.presentation.payments.navigateToPayments
import kotlinx.coroutines.CoroutineScope

@Composable
fun rememberFinmoniAppState(
    coroutineScope: CoroutineScope = rememberCoroutineScope(),
    navController : NavHostController = rememberNavController()
) : FinmoniAppState{
    return remember(coroutineScope,navController){
        FinmoniAppState(navController,coroutineScope)
    }
}



@Stable
class FinmoniAppState(
    val navController: NavHostController,
    val coroutineScope: CoroutineScope
){

    val currentDestination: NavDestination?
        @Composable get() = navController.currentBackStackEntryAsState().value?.destination


    val topLevelDestinations = TopLevelDestination.values().toList()

    val shouldShowBottomBar: Boolean
        @Composable get() = currentDestination?.hierarchy?.any { destination ->
            topLevelDestinations.any {
                destination.route?.contains(it.route) ?: false
            }
        } ?: false

    fun navigateToTopLevelDestination(topLevelDestination: TopLevelDestination) {
        val topLevelOptions = navOptions {
            popUpTo(overviewRoute) {
                saveState = true
            }
            launchSingleTop = true
            restoreState = true
        }

        when (topLevelDestination) {
            TopLevelDestination.OVERVIEW -> navController.navigateToOverview(topLevelOptions)
            TopLevelDestination.PAYMENTS -> navController.navigateToPayments(topLevelOptions)
        }
    }




}