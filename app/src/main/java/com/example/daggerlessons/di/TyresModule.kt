package com.example.daggerlessons.di

import com.example.daggerlessons.thirdParty.Tyres
import dagger.Module
import dagger.Provides

@Module
class TyresModule {
    @Provides
    fun getTyres(): Tyres{
        return Tyres();
    }
}