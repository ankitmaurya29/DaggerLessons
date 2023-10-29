package com.example.daggerlessons

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.daggerlessons.di.CylindersModule
import com.example.daggerlessons.di.DaggerCarComponent
import com.example.daggerlessons.di.DaggerRoadComponent
import com.example.daggerlessons.di.TyresModule
import com.example.daggerlessons.model.Road
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    private val TAG = "DG*Main"

    @Inject
    lateinit var road: Road
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //DaggerCarComponenet.create() exists untill all the modules dont have a constructor.
//        val component =
//            DaggerCarComponent.create();/* CarComponent interface becomes DaggerCarComponent class with factory methods */
//       val carObj = component.getCar()/* getcar is what is defined in the CarComponent Interface */

        //Since we have added a  module CylindersModule with a constructor, we need to pass the
        //module object and invoke build().
        val component = DaggerCarComponent.builder().cylindersModule(CylindersModule(12))
        val carObj = component.build().getCar()
        DaggerRoadComponent.create().inject(this);//this performs field injection.
        //This is needed in this case and not needed in the case of field injection of
        //Engine class, becuase, when we perform constructor injection, then field injection
        //and method injection happens automatically. But MainActivity is not created by us
        //hence this is workaround to manually call the injection.
        Log.d(TAG, "Created car: $carObj")
    }
}