package com.example.cryptcurrencycomposesample.domain.use_case.get_coin

import com.example.cryptcurrencycomposesample.common.Resource
import com.example.cryptcurrencycomposesample.data.remote.dto.toCoin
import com.example.cryptcurrencycomposesample.data.remote.dto.toCoinDetail
import com.example.cryptcurrencycomposesample.domain.model.Coin
import com.example.cryptcurrencycomposesample.domain.model.CoinDetail
import com.example.cryptcurrencycomposesample.domain.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetCoinUseCase @Inject constructor(
    private val coinRepository: CoinRepository
) {
    operator fun invoke(coinId: String): Flow<Resource<CoinDetail>> = flow {
        try {
            emit(Resource.Loading())
            val coinDetail = coinRepository.getCoinById(coinId).toCoinDetail()
            emit(Resource.Success(coinDetail))
        } catch (e: HttpException) {
            emit(Resource.Error(e.localizedMessage ?: "An unexpected error occurred"))
        } catch (e: IOException) {
            emit(Resource.Error("Couldn't reach server. Check your internet connection"))
        }
    }
}