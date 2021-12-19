package com.example.cryptcurrencycomposesample.domain.model

import com.example.cryptcurrencycomposesample.data.remote.dto.TeamMember

data class CoinDetail(
    val coinId: String,
    val name: String,
    val description: String,
    val symbol: String,
    val rank: Int,
    val tags: List<String>,
    val team: List<TeamMember>
)
