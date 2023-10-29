package com.example.daggerlessons.di

import android.util.Log
import javax.inject.Inject

class Road @Inject constructor() {
    private val TAG = "DG*Road"
    init {
        Log.d(TAG, "Constructing Road: $this")
    }
}