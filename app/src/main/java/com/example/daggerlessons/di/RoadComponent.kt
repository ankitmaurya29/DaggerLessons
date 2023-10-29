package com.example.daggerlessons.di

import com.example.daggerlessons.MainActivity
import com.example.daggerlessons.model.Road
import dagger.Component

@Component
interface RoadComponent {
    fun createRoad() : Road
    fun inject(mainActivity: MainActivity);
}