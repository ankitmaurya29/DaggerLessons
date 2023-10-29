package com.example.daggerlessons.model

import android.util.Log
import com.example.daggerlessons.thirdParty.Tyres
import javax.inject.Inject
/*
    Adding constructor injection. by doing so we add this objec to
    dependency graph and dagger can use it to provide us the dependency when used.
 */
class Car @Inject constructor(val engine: Engine, val tyre: Tyres) {
    //Engine get automatically added becuase Engine is also added to dependency
    //graph and dagger knows how to create this engine.
    private val TAG = "DG*Car"

    init {
        Log.d(TAG, "Initiating Car: ${this}")
    }

    @Inject
    fun driveOnRoad(road: Road) {
        //Dagger calls this method internally after constructor and field injection
        //are done. The only use case to use method injection is when this method
        //requires a Car object instantiated before calling this.
        Log.d(TAG, "driveOnRoad: Driving $this on road $road")
    }
}