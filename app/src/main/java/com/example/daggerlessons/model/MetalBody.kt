package com.example.daggerlessons.model

import android.util.Log
import javax.inject.Inject

class MetalBody @Inject constructor(): Body {
    private val TAG = "DG*MetalBody"
    override fun fixBody() {
        Log.d(TAG, "fixMetalBody: $this")
    }
}