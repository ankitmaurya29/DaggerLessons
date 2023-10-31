package com.example.daggerlessons

import android.app.Application
import com.example.daggerlessons.di.DaggerRoadComponent
import com.example.daggerlessons.di.RoadComponent
/*
Untill the application is alive, the read component is alive and a componenet which has a @singleton
Road class will be only created once. Hence we are achieving singleton application wide.
 */
class MainApplicaton : Application() {

    lateinit var roadComponent: RoadComponent

    override fun onCreate() {
        super.onCreate()
        roadComponent = DaggerRoadComponent.create()
    }
}