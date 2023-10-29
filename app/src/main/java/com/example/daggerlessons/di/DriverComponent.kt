package com.example.daggerlessons.di

import com.example.daggerlessons.model.Driver
import dagger.BindsInstance
import dagger.Component
import javax.inject.Named

@Component
interface DriverComponent {
    fun getDriver(): Driver

    @Component.Builder
    interface Builder{
        @BindsInstance
        //Whenever any one this component needs string then pass this
        fun setDriverName(@Named("driver name")name: String): Builder

        @BindsInstance
        fun setCountryName(@Named("country name")name: String): Builder
        fun build() : DriverComponent
    }
}