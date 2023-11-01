package com.example.daggerlessons

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.daggerlessons.di.CylindersModule
import com.example.daggerlessons.di.DaggerCarComponent
import com.example.daggerlessons.di.DaggerDriverComponent
import com.example.daggerlessons.di.DaggerRoadComponent
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
        val component = DaggerCarComponent.builder()
            .roadComponent((application as MainApplicaton).roadComponent)
            .cylindersModule(CylindersModule(12)).build()
        val carObj = component.getCar()
        val carObj2 = component.getCar()
        Log.d(TAG, "Created car: $carObj.")
        Log.d(TAG, "car1.tyre: ${carObj.tyre}, car2.tyre: ${carObj2.tyre}")


        DaggerRoadComponent.create().inject(this);//this performs field injection.
        //This is needed in this case and not needed in the case of field injection of
        //Engine class, becuase, when we perform constructor injection, then field injection
        //and method injection happens automatically. But MainActivity is not created by us
        //hence this is workaround to manually call the injection.

        val road1 = (application as MainApplicaton).roadComponent.createRoad()
        val road2 = (application as MainApplicaton).roadComponent.createRoad()
        Log.d(TAG, "Creating 2 roads via application component: $road1 $road2")

        /*
            Getting driver by passing name dynamically, through the use of @Component.Builder and @BindsInstance
         */
        val driver = DaggerDriverComponent.builder().setDriverName("Max Hamilton").setCountryName("Belium UK").build().getDriver()
        Log.d(TAG, "Car driven by ${driver.name} [${driver}]")


        /* using carSubComponent via road component*/
        val carViaSubComponent = (application as MainApplicaton).roadComponent.getCarSubComponent(CylindersModule(6)).getCar()
        Log.d(TAG, "Car created via subcomponent: $carViaSubComponent")
    }
}