package com.example.cryptcurrencycomposesample.presentaion.coin_detail.components

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.cryptcurrencycomposesample.common.Resource
import com.example.cryptcurrencycomposesample.domain.use_case.get_coin.GetCoinUseCase
import com.example.cryptcurrencycomposesample.domain.use_case.get_coins.GetCoinsUseCase
import com.example.cryptcurrencycomposesample.presentaion.coin_detail.CoinDetailState
import com.example.cryptcurrencycomposesample.presentaion.coin_list.CoinListState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class CoinDetailViewModel @Inject constructor(
    private val getCoinUseCase: GetCoinUseCase
) : ViewModel() {
    private val _state = mutableStateOf(CoinDetailState())
    val state: State<CoinListState> = _state

    init {
        getCoins()
    }
    private fun getCoins() {
        getCoinUseCase().onEach { result ->
            when (result) {
                is Resource.Success -> {
                    _state.value = CoinListState(coins = result.data ?: emptyList())
                }
                is Resource.Error -> {
                    _state.value = CoinListState(
                        error = result.message ?: "An unexpected error occurred"
                    )
                }
                is Resource.Loading -> {
                    _state.value = CoinListState(isLoading = true)
                }
            }
        }.launchIn(viewModelScope)
    }
}