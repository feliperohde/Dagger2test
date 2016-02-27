package com.androidhero.dagger2test.module;

import com.androidhero.dagger2test.model.Motor;
import com.androidhero.dagger2test.model.Vehicle;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by feliperohde on 2/27/16.
 */
@Module
public class VehicleModule {

    @Provides @Singleton
    Motor provideMotor(){
        return new Motor();
    }

    @Provides @Singleton
    Vehicle provideVehicle(){
        return new Vehicle(new Motor());
    }
}
