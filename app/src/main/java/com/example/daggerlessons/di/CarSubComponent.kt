package com.example.daggerlessons.di

import com.example.daggerlessons.model.Car
import dagger.Component
import dagger.Subcomponent
import javax.inject.Singleton
/*
    Component hold the complete dependency graph,
    we define functions, and based on the return type Dagger provides us the object.

    Even though Dagger knows how to create Engine, Creating Engine is not exposed to
    DaggerCarComponent client.
 */
@ActivityScope
@Subcomponent(modules = [TyresModule::class, BodyModule::class, CylindersModule::class])
/*
this component is dependent on RoadComponent which is initialised at applicaton class. We need to set the
component when creating CarComponent.
 */
interface CarSubComponent {
    fun getCar() : Car
}