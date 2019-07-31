package com.ansari.testdagger2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    private static final String TAG = "MainActivity";
    Car car;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      CarComponent carComponent = DaggerCarComponent.create();

        car = carComponent.getCar();
        car.drive();



       /* Piston piston = new Piston();
        Cylinder cylinder = new Cylinder();
          Rim rim = new Rim();

        Engine engine = new Engine(piston, cylinder);
        Wheels wheels = new Wheels(rim);*/


       /* Engine engine = new Engine();
        Wheels wheels = new Wheels();

        Car car = new Car(engine,wheels);
        car.drive();*/
    }
}
