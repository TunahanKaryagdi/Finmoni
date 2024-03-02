package com.tunahankaryagdi.finmoni.presentation.payments.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import com.tunahankaryagdi.finmoni.presentation.consts.Padding

@Composable
fun PaymentCard(
    modifier: Modifier = Modifier
) {

    var show by remember {
        mutableStateOf(false)
    }

    if (show){
        PaymentDetailDialog()
    }

    Box(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = Padding.medium, vertical = Padding.small)
            .clickable {
                show = true
            }
    ){
        Row (
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ){
            Column() {
                Text(
                    text = "Title",
                    style = MaterialTheme.typography.bodyLarge
                )
                Text(
                    text = "20.12.2024",
                    style = MaterialTheme.typography.bodyMedium.copy(fontWeight = FontWeight.ExtraBold)
                )
            }
            Text(
                text = "20",
                style = MaterialTheme.typography.titleLarge.copy(fontWeight = FontWeight.ExtraBold)
            )
        }
    }
}