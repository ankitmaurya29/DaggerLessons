package com.example.daggerlessons.di

import com.example.daggerlessons.MainActivity
import com.example.daggerlessons.model.Road
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component
interface RoadComponent {
    fun createRoad() : Road
    fun inject(mainActivity: MainActivity);

    fun getCarSubComponent(cylindersModule: CylindersModule): CarSubComponent
}