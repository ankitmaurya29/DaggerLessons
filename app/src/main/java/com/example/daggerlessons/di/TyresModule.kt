package com.example.daggerlessons.di

import com.example.daggerlessons.thirdParty.Tyres
import dagger.Module
import dagger.Provides

@Module
class TyresModule {
    @Provides
    @ActivityScope
    fun getTyres(): Tyres{
        return Tyres();
    }
}