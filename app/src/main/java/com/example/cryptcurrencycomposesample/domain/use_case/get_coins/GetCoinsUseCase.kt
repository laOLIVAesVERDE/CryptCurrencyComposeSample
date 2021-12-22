package com.example.cryptcurrencycomposesample.domain.use_case.get_coins

import com.example.cryptcurrencycomposesample.domain.repository.CoinRepository
import javax.inject.Inject

class GetCoinsUseCase @Inject constructor(
    private val coinRepository: CoinRepository
) {
}