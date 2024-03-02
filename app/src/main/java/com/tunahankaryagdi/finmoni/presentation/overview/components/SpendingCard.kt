package com.tunahankaryagdi.finmoni.presentation.overview.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.tunahankaryagdi.finmoni.presentation.consts.Padding


@Composable
fun SpendingCard(
    modifier: Modifier = Modifier
) {

    Surface(
        modifier = modifier
            .fillMaxWidth(),
        shadowElevation = 5.dp,
        shape = RoundedCornerShape(5.dp),
        color = MaterialTheme.colorScheme.secondary
    ) {

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = Padding.medium, vertical = Padding.small)
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
                        style = MaterialTheme.typography.bodyLarge.copy(fontWeight = FontWeight.Bold)
                    )
                    Text(text = "abc")
                }
                Text(
                    text = "20$",
                    style = MaterialTheme.typography.titleLarge.copy(fontWeight = FontWeight.ExtraBold)
                )
            }
        }

    }

}