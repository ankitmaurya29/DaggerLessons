package com.example.daggerlessons.thirdParty

import android.util.Log

/*Third party library, it can't be constructor inject*/
class Tyres {
    private val TAG = "DG*Tyres"
    init {
        Log.d(TAG, "Initiating tyres: $this")
    }
}