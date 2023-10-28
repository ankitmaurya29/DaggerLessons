package com.example.daggerlessons.di

import dagger.Component
/*
    Component hold the complete dependency graph,
    we define functions, and based on the return type Dagger provides us the object.
 */
@Component
interface CarComponent {
    fun getCar() : Car
}