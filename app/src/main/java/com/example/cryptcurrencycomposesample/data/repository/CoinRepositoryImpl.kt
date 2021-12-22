package com.example.cryptcurrencycomposesample.data.repository

import com.example.cryptcurrencycomposesample.data.remote.CoinPaprikaApi
import com.example.cryptcurrencycomposesample.data.remote.dto.CoinDetailDto
import com.example.cryptcurrencycomposesample.data.remote.dto.CoinDto
import com.example.cryptcurrencycomposesample.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
) : CoinRepository {
    override suspend fun getCoins(): List<CoinDto> {
        TODO("Not yet implemented")
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        TODO("Not yet implemented")
    }
}