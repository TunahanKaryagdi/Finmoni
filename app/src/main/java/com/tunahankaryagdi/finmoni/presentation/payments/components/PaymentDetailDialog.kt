package com.tunahankaryagdi.finmoni.presentation.payments.components

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import com.tunahankaryagdi.finmoni.R


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