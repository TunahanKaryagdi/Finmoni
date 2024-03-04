package com.tunahankaryagdi.finmoni

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.tunahankaryagdi.finmoni.presentation.add_payment.addPaymentRoute
import com.tunahankaryagdi.finmoni.presentation.navigation.NavigationHost
import com.tunahankaryagdi.finmoni.presentation.overview.overviewRoute
import com.tunahankaryagdi.finmoni.presentation.payments.paymentsRoute
import com.tunahankaryagdi.finmoni.ui.theme.FinmoniTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FinmoniTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.White
                ) {
                    val navController = rememberNavController()
                    NavigationHost(
                        navController = navController,
                        startDestination = addPaymentRoute
                    )
                }
            }
        }
    }
}



@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    FinmoniTheme {
        Greeting("Android")
    }
}