package com.androidhero.dagger2test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.androidhero.dagger2test.component.ApplicationComponent;
import com.androidhero.dagger2test.component.DaggerVehicleComponent;
import com.androidhero.dagger2test.component.VehicleComponent;
import com.androidhero.dagger2test.model.Vehicle;
import com.androidhero.dagger2test.module.VehicleModule;

public class MainActivity extends AppCompatActivity {

    Vehicle vehicle;
    VehicleComponent vehicleComponent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vehicleComponent = DaggerVehicleComponent.builder().applicationComponent(getApplicationComponent()).vehicleModule(new VehicleModule()).build();
        vehicle = vehicleComponent.provideVehicle();
        vehicleComponent.inject(vehicle);

        vehicle.increaseSpeed(30);


        Log.e("Velocity", String.valueOf(vehicle.getSpeed()));


    }


    private ApplicationComponent getApplicationComponent() {
        return ((AndroidApplication) getApplication()).getmApplicationComponent();
    }
}
