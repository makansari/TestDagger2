package com.ansari.testdagger2;

import android.util.Log;

import javax.inject.Inject;

public class Car {

    private static final String TAG = "Car";

    
    Engine engine;
    Wheels wheels;
   /* Car(){
         engine = new Engine();
         wheels  = new Wheels();
    }*/


@Inject
   Car(Engine engine,Wheels wheels){
       this.engine = engine;
       this.wheels = wheels;
   }

    public void drive(){
        Log.d(TAG, "drive: called");

    }
}
