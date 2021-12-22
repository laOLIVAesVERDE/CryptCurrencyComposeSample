package com.example.cryptcurrencycomposesample.domain.use_case.get_coins

import com.example.cryptcurrencycomposesample.common.Resource
import com.example.cryptcurrencycomposesample.domain.model.Coin
import com.example.cryptcurrencycomposesample.domain.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetCoinsUseCase @Inject constructor(
    private val coinRepository: CoinRepository
) {
    operator fun invoke(): Flow<Resource<List<Coin>>> {
        
    }
}