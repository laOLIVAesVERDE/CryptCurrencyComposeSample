package com.example.cryptcurrencycomposesample.presentaion.coin_list.components

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.cryptcurrencycomposesample.common.Resource
import com.example.cryptcurrencycomposesample.domain.use_case.get_coins.GetCoinsUseCase
import com.example.cryptcurrencycomposesample.presentaion.coin_list.CoinListState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class CoinListViewModel @Inject constructor(
  private val getCoinsUseCase: GetCoinsUseCase
) : ViewModel() {
  private val _state = mutableStateOf(CoinListState())
  val state: State<CoinListState> = _state

  private fun getCoins() {
    getCoinsUseCase().onEach { result ->
      when (result) {
        is Resource.Success -> {

        }
        is Resource.Error -> {

        }
        is Resource.Loading -> {
          
        }
      }
    }
  }
}