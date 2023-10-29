package com.example.daggerlessons

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.daggerlessons.di.DaggerCarComponent

class MainActivity : AppCompatActivity() {
    private val TAG = "DG*Main"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val component =
            DaggerCarComponent.create();/* CarComponent interface becomes DaggerCarComponent class with factory methods */
        val carObj = component.getCar()/* getcar is what is defined in the CarComponent Interface */
        Log.d(TAG, "Created car: $carObj")
    }
}