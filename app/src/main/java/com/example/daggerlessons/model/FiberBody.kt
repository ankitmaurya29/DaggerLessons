package com.example.daggerlessons.model

import android.util.Log
import javax.inject.Inject

class FiberBody @Inject constructor(): Body {
    private val TAG = "DG*FiberBody"
    override fun fixBody() {
        Log.d(TAG, "fixFiberBody: $this")
    }
}