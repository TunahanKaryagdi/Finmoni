package com.tunahankaryagdi.finmoni.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.tunahankaryagdi.add_payment.addPaymentScreen
import com.tunahankaryagdi.add_payment.navigateToAddPayment
import com.tunahankaryagdi.login.logInScreen
import com.tunahankaryagdi.overview.overviewScreen
import com.tunahankaryagdi.payments.paymentsScreen
import com.tunahankaryagdi.signup.signUpScreen


@Composable
fun FinmoniNavHost(
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

        paymentsScreen(
            navigateToAddPayment = {navController.navigateToAddPayment()}
        )

        addPaymentScreen()

        logInScreen()

        signUpScreen()
    }
}


