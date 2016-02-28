package com.androidhero.dagger2test.component;

import android.content.SharedPreferences;

import com.androidhero.dagger2test.MainActivity;
import com.androidhero.dagger2test.model.Vehicle;
import com.androidhero.dagger2test.module.VehicleModule;
import com.androidhero.dagger2test.scope.PerActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by feliperohde on 2/27/16.
 */

@PerActivity
@Component(
        dependencies = {ApplicationComponent.class},
        modules = {VehicleModule.class}
)
public interface VehicleComponent {
    public void inject(Vehicle vehicle);

    Vehicle provideVehicle();

    SharedPreferences providePreferences();
}
