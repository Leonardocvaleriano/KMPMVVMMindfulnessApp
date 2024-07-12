package com.codeplace.kmpmvvmmindfulnessapp.di

import dagger.Component.Factory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import data.network.KtorApi
import data.network.MindfulnessBooksService
import data.network.repository.MindfulnessBooksRepositoryImpl
import domain.repository.MindfulnessBooksRepository
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Provides
    @Singleton
    fun provideMindfulnessBooksService():MindfulnessBooksService{
        return MindfulnessBooksService()

    }

    @Provides
    @Singleton
    fun provideMindfulnessBooksRepository(mindfulnessBooksService:MindfulnessBooksService): MindfulnessBooksRepository {
        return MindfulnessBooksRepositoryImpl(mindfulnessBooksService)
    }
}