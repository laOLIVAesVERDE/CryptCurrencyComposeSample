package com.example.cryptcurrencycomposesample.presentaion.coin_list.components

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.cryptcurrencycomposesample.domain.use_case.get_coins.GetCoinsUseCase
import com.example.cryptcurrencycomposesample.presentaion.coin_list.CoinListState
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CoinListViewModel @Inject constructor(
  private val getCoinsUseCase: GetCoinsUseCase
) : ViewModel() {
  private val _state = mutableStateOf<CoinListState>(CoinListState())
}