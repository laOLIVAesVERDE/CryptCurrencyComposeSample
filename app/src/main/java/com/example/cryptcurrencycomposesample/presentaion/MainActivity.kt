package com.example.cryptcurrencycomposesample.presentaion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.cryptcurrencycomposesample.presentaion.coin_list.components.CoinListScreen
import com.example.cryptcurrencycomposesample.presentaion.coin_detail.components.CoinDetailScreen
import com.example.cryptcurrencycomposesample.presentaion.ui.theme.CryptocurrencyAppYTTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CryptocurrencyAppYTTheme {
                Surface(color = MaterialTheme.colors.background) {
                    val navController = rememberNavController()
                    NavHost(
                        navController = navController,
                        startDestination = Screen.CoinListScreen.route) {
                        composable(
                            route = Screen.CoinListScreen.route
                        ) {
                            CoinListScreen(
                                navController
                            )
                        }
                        composable(
                            route = Screen.CoinDetailScreen.route
                        ) {
                            CoinDetailScreen()
                        }
                    }
                }
            }
        }
    }
}