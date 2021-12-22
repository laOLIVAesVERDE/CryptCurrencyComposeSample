package com.example.cryptcurrencycomposesample.data.repository

import com.example.cryptcurrencycomposesample.data.remote.CoinPaprikaApi
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
) {
}