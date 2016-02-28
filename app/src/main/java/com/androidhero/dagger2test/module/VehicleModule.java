package com.androidhero.dagger2test.module;

import com.androidhero.dagger2test.model.Motor;
import com.androidhero.dagger2test.model.Vehicle;
import com.androidhero.dagger2test.scope.PerActivity;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by feliperohde on 2/27/16.
 */
@Module
public class VehicleModule {

    @Provides @PerActivity
    Motor provideMotor(){
        return new Motor();
    }

    @Provides @PerActivity
    Vehicle provideVehicle(){
        return new Vehicle();
    }
}
