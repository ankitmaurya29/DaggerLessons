package com.example.daggerlessons.model

import android.util.Log
import javax.inject.Inject
import javax.inject.Named

class Driver @Inject constructor(@Named("driver name")val name: String, @Named("country name") val countryName: String) {
    private val TAG = "DG*Driver"
    init {
        Log.d(TAG, "Driving : $this, name: $name country: $countryName")
    }
}