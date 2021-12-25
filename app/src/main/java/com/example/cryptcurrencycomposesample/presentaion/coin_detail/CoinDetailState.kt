package com.example.cryptcurrencycomposesample.presentaion.coin_detail

import com.example.cryptcurrencycomposesample.domain.model.Coin
import com.example.cryptcurrencycomposesample.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coinDetail: CoinDetail? = null,
    val error: String = ""
)
