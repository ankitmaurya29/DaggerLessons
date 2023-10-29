package com.example.daggerlessons.di

import com.example.daggerlessons.model.Cyclinders
import dagger.Module
import dagger.Provides

@Module
class CylindersModule(val cylindersCount: Int) {

    @Provides
    fun getCyclinders(): Cyclinders {
        return Cyclinders(cylindersCount)
    }

}