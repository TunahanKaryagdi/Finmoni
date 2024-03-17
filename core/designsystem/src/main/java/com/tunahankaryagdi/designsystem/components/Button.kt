package com.tunahankaryagdi.designsystem.components

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.tunahankaryagdi.designsystem.icons.FinmoniIcons


@Composable
fun FinmoniButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
    text: String
) {

    Button(
        modifier = modifier,
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(

        ),
        shape = RoundedCornerShape(5.dp),
    ) {
        Text(
            text = text,
            style = MaterialTheme.typography.bodyMedium.copy(fontWeight = FontWeight.Bold)
        )
    }
}


@Composable
fun FinmoniFloatingActionButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
    text: String
) {


    FloatingActionButton(
        modifier = modifier,
        onClick = onClick,
        containerColor = MaterialTheme.colorScheme.primary
    ) {
        Icon(imageVector = FinmoniIcons.Add, contentDescription = text)
    }

}