package com.example.cryptcurrencycomposesample.presentaion.coin_detail

import com.example.cryptcurrencycomposesample.domain.model.Coin

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)
