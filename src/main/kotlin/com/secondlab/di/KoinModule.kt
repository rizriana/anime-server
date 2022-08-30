package com.secondlab.di

import com.secondlab.repository.HeroRepository
import com.secondlab.repository.HeroRepositoryImpl
import org.koin.dsl.module

val koinModule = module {
    single<HeroRepository> {
        HeroRepositoryImpl()
    }
}