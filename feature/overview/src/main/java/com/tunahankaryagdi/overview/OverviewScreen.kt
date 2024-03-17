package com.tunahankaryagdi.overview

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.tunahankaryagdi.designsystem.components.SpacerVertical
import com.tunahankaryagdi.designsystem.dimen.Padding
import com.tunahankaryagdi.ui.OverviewChart
import com.tunahankaryagdi.ui.SpendingCard

@Composable
fun OverviewScreenRoute(
    modifier: Modifier = Modifier
) {

    OverviewScreen(
        modifier = modifier
    )

}


@Composable
fun OverviewScreen(
    modifier: Modifier = Modifier
) {

    LazyColumn(
        modifier = modifier
            .padding(Padding.medium),
    ) {

        item {
            OverviewChart()
        }
        item {
            Text(
                text = stringResource(id = R.string.recent_spendings),
                style = MaterialTheme.typography.titleLarge.copy(fontWeight = FontWeight.Bold),
                color = MaterialTheme.colorScheme.primary
            )
            SpacerVertical(Padding.small)
        }
        items(5){
            SpendingCard()
            SpacerVertical(Padding.small)
        }

        item {
            Text(
                modifier = Modifier.fillMaxWidth(),
                text = stringResource(id = R.string.show_more),
                color = MaterialTheme.colorScheme.primary,
                textAlign = TextAlign.Center
            )
        }

    }
}





