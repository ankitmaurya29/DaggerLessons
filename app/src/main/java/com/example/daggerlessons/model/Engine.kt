package com.example.daggerlessons.model

import android.util.Log
import javax.inject.Inject


class Engine @Inject constructor(val cyclinders: Cyclinders) {
    private val TAG = "DG*Engine"

    @Inject
    lateinit var piston: Piston /* first constructor gets inject,
     then field, then method injection*/

    init {
        Log.d(TAG, "creating engine: ${this}")
    }
}