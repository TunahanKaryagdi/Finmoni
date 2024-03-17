package com.tunahankaryagdi.payments

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import com.tunahankaryagdi.designsystem.components.FinmoniFloatingActionButton
import com.tunahankaryagdi.designsystem.components.FinmoniTopAppBar
import com.tunahankaryagdi.ui.PaymentCard


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
            FinmoniTopAppBar(
                title = {
                    Text(text = stringResource(id = R.string.payments))
                }
            )
        },
        floatingActionButton = {
            FinmoniFloatingActionButton(onClick = {}, text = stringResource(R.string.add_payment))
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

@Composable
fun PaymentDetailDialog(
    modifier: Modifier = Modifier
) {

    AlertDialog(
        modifier = modifier,
        onDismissRequest = {  },
        confirmButton = {
            Text(text = stringResource(id = R.string.done))
        },
        dismissButton = {
            Text(
                text = stringResource(id = R.string.delete),
                color = Color.Red
            )
        },
        title = {
            Text(text = "Title")
        },
        text = {
            Column {
                Text(
                    text =  stringResource(id = R.string.last_payment_date, "20.02.2024"),
                    style = MaterialTheme.typography.bodyLarge.copy(fontWeight = FontWeight.Bold)
                )
                Text(
                    text = "20",
                    style = MaterialTheme.typography.bodyLarge.copy(fontWeight = FontWeight.Bold)
                )
            }
        },
        titleContentColor = MaterialTheme.colorScheme.primary
    )
}