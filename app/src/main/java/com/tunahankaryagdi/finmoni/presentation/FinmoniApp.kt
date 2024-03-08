package com.tunahankaryagdi.finmoni.presentation

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import com.tunahankaryagdi.finmoni.presentation.navigation.NavigationHost
import com.tunahankaryagdi.finmoni.presentation.overview.overviewRoute

@Composable
fun FinmoniApp(
    modifier: Modifier = Modifier,
    appState: FinmoniAppState = rememberFinmoniAppState()
) {

    Scaffold(
        modifier = modifier,
        bottomBar = {

            AnimatedVisibility(visible = appState.shouldShowBottomBar) {
                AppNavBar(
                    destinations = AppDestinations(appState.topLevelDestinations),
                    onNavigateToDestination = appState::navigateToTopLevelDestination,
                    currentDestination = appState.currentDestination
                )
            }


        }
    )
    {
        NavigationHost(
            navController = appState.navController,
            startDestination = overviewRoute,
            modifier = modifier.padding(it)
        )
    }


}

data class AppDestinations(
    val destinations: List<TopLevelDestination>
) : List<TopLevelDestination> by destinations


@Composable
internal fun AppNavBar(
    destinations: AppDestinations,
    onNavigateToDestination: (TopLevelDestination) -> Unit,
    currentDestination: NavDestination?,
) {

    val height = LocalConfiguration.current.screenHeightDp

    BottomAppBar(
        modifier = Modifier
            .height((height * 0.08).dp),
    ) {

        destinations.map {destination->
            val selected = currentDestination?.hierarchy?.any{it.route == destination.route} ?: true
            BottomNavigationItem(
                selected = selected,
                onClick = { onNavigateToDestination(destination) },
                icon = {
                    Icon(
                        imageVector = Icons.Outlined.Info,
                        contentDescription =  stringResource(id = destination.textId),
                    )
                },
                label = {
                    Text(
                        text = stringResource(id = destination.textId),
                    )
                },
            )
        }
    }
}