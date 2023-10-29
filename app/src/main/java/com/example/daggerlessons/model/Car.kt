package com.example.daggerlessons.model

import android.util.Log
import javax.inject.Inject
/*
    Adding constructor injection. by doing so we add this objec to
    dependency graph and dagger can use it to provide us the dependency when used.
 */
class Car @Inject constructor(engine: Engine) {
    //Engine get automatically added becuase Engine is also added to dependency
    //graph and dagger knows how to create this engine.
    private val TAG = "DG*Car"
    init {
        Log.d(TAG, "Initiating Car: ${this}")
    }
}