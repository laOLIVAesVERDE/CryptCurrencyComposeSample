package com.example.cryptcurrencycomposesample.domain.use_case.get_coins

import com.example.cryptcurrencycomposesample.common.Resource
import com.example.cryptcurrencycomposesample.data.remote.dto.toCoin
import com.example.cryptcurrencycomposesample.domain.model.Coin
import com.example.cryptcurrencycomposesample.domain.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetCoinsUseCase @Inject constructor(
    private val coinRepository: CoinRepository
) {
    operator fun invoke(): Flow<Resource<List<Coin>>> = flow {
        try {
            emit(Resource.Loading())
            val coins = coinRepository.getCoins().map { it.toCoin() }
        } catch (e: HttpException) {

        } catch (e: IOException) {

        }
    }
}