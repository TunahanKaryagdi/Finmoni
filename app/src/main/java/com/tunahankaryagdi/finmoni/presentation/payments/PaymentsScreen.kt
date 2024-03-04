package com.tunahankaryagdi.finmoni.presentation.payments

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.tunahankaryagdi.finmoni.R
import com.tunahankaryagdi.finmoni.presentation.components.CustomFloatingActionButton
import com.tunahankaryagdi.finmoni.presentation.components.CustomTopAppBar
import com.tunahankaryagdi.finmoni.presentation.payments.components.PaymentCard


@Composable
fun PaymentsScreenRoute(
    modifier: Modifier = Modifier
) {
    PaymentsScreen(modifier = modifier)
}

@Composable
fun PaymentsScreen(
    modifier: Modifier = Modifier
) {



    Scaffold (
        modifier = modifier,
        topBar = {
            CustomTopAppBar(
                title = {
                    Text(text = stringResource(id = R.string.payments))
                }
            )
        },
        floatingActionButton = {
            CustomFloatingActionButton(onClick = {})
        }
    ){
        PaymentsScreenContent(modifier = Modifier.padding(it))
    }

}


@Composable
fun PaymentsScreenContent(
    modifier: Modifier = Modifier,
) {

    LazyColumn(modifier = modifier){
        items(5){
            PaymentCard()
        }
    }

}