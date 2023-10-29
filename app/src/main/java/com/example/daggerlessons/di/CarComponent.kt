package com.example.daggerlessons.di

import com.example.daggerlessons.model.Car
import dagger.Component
/*
    Component hold the complete dependency graph,
    we define functions, and based on the return type Dagger provides us the object.

    Even though Dagger knows how to create Engine, Creating Engine is not exposed to
    DaggerCarComponent client.
 */
@Component(modules = [TyresModule::class, BodyModule::class])
interface CarComponent {
    fun getCar() : Car
}