package com.example.daggerlessons.di

import com.example.daggerlessons.model.Driver
import dagger.BindsInstance
import dagger.Component

@Component
interface DriverComponent {
    fun getDriver(): Driver

    @Component.Builder
    interface Builder{
        @BindsInstance
        //Whenever any one this component needs string then pass this
        fun setDriverName(name: String): Builder
        fun build() : DriverComponent
    }
}