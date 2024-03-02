package com.tunahankaryagdi.finmoni.presentation.overview

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.tunahankaryagdi.finmoni.R
import com.tunahankaryagdi.finmoni.presentation.components.SpacerVertical
import com.tunahankaryagdi.finmoni.presentation.consts.Padding
import com.tunahankaryagdi.finmoni.presentation.overview.components.OverviewChart
import com.tunahankaryagdi.finmoni.presentation.overview.components.SpendingCard
import com.tunahankaryagdi.finmoni.ui.theme.FinmoniTheme


@Composable
fun OverviewScreenRoute(
    modifier: Modifier = Modifier
) {

    OverviewScreen()

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

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun OverviewPreview() {
    FinmoniTheme {
        OverviewScreen()
    }
}