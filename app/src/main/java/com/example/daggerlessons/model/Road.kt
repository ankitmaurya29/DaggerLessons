package com.example.daggerlessons.model

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class Road @Inject constructor() {
    private val TAG = "DG*Road"
    init {
        Log.d(TAG, "Constructing Road: $this")
    }
}