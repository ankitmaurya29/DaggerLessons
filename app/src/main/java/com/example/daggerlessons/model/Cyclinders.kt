package com.example.daggerlessons.model

import android.util.Log
import javax.inject.Inject

class Cyclinders @Inject constructor() {
    private  val TAG = "DG*Cyclinder"
    init {
        Log.d(TAG, "Creating Cyclinders: $this")
    }
}