package com.tunahankaryagdi.finmoni.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.tunahankaryagdi.finmoni.presentation.add_payment.addPaymentScreen
import com.tunahankaryagdi.finmoni.presentation.log_in.logInScreen
import com.tunahankaryagdi.finmoni.presentation.overview.overviewScreen
import com.tunahankaryagdi.finmoni.presentation.payments.paymentsScreen
import com.tunahankaryagdi.finmoni.presentation.sign_up.signUpScreen


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

        paymentsScreen()

        addPaymentScreen()

        logInScreen()

        signUpScreen()
    }
}