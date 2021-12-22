package com.example.cryptcurrencycomposesample.domain.repository

import com.example.cryptcurrencycomposesample.data.remote.dto.CoinDto

interface CoinRepository {
    suspend fun getCoins(): List<CoinDto>

}