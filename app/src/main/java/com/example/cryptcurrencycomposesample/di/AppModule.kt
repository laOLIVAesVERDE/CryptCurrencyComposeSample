package com.example.cryptcurrencycomposesample.di

import com.example.cryptcurrencycomposesample.data.remote.CoinPaprikaApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun providePaprikaApi(): CoinPaprikaApi {
        
    }
}