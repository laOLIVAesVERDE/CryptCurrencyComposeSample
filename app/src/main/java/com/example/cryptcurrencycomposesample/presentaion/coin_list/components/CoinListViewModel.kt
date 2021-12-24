package com.example.cryptcurrencycomposesample.presentaion.coin_list.components

import androidx.lifecycle.ViewModel
import com.example.cryptcurrencycomposesample.domain.use_case.get_coins.GetCoinsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CoinListViewModel @Inject constructor(
  private val getCoinsUseCase: GetCoinsUseCase
) : ViewModel() {
}