package com.example.daggerlessons.model

import android.util.Log
import javax.inject.Inject


class Engine @Inject constructor() {
    private val TAG = "DG*Engine"
    init {
        Log.d(TAG, "creating engine: ${this}")
    }
}