package com.example.cryptcurrencycomposesample.presentaion.coin_list

import com.example.cryptcurrencycomposesample.domain.model.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList()
)
