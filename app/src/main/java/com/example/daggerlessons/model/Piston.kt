package com.example.daggerlessons.model

import android.util.Log
import javax.inject.Inject

class Piston @Inject constructor() {
    private val TAG = "DG*Piston"

    init {
        Log.d(TAG, "Creating Piston : $this")
    }
}