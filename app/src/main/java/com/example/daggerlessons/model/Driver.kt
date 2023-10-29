package com.example.daggerlessons.model

import android.util.Log
import javax.inject.Inject

class Driver @Inject constructor(val name: String) {
    private val TAG = "DG*Driver"
    init {
        Log.d(TAG, "Driving : $this")
    }
}