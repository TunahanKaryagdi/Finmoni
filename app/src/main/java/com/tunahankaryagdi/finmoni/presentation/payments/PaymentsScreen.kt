package com.tunahankaryagdi.finmoni.presentation.payments

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.tunahankaryagdi.finmoni.R
import com.tunahankaryagdi.finmoni.presentation.components.CustomFloatingActionButton
import com.tunahankaryagdi.finmoni.presentation.components.CustomTextField
import com.tunahankaryagdi.finmoni.presentation.components.CustomTopAppBar
import com.tunahankaryagdi.finmoni.presentation.payments.components.PaymentCard
import com.tunahankaryagdi.finmoni.presentation.payments.components.PaymentCreateDialog


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

    var show by remember{
        mutableStateOf(false)
    }

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
            CustomFloatingActionButton(onClick = {show = true})
        }
    ){
        PaymentsScreenContent(modifier = Modifier.padding(it),show)
    }

}


@Composable
fun PaymentsScreenContent(
    modifier: Modifier = Modifier,
    showButton: Boolean
) {

    if (showButton){
        PaymentCreateDialog()
    }

    LazyColumn(modifier = modifier){
        items(5){
            PaymentCard()
        }
    }

}