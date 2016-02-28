package com.androidhero.dagger2test;

import android.app.Application;

import com.androidhero.dagger2test.component.ApplicationComponent;
import com.androidhero.dagger2test.component.DaggerApplicationComponent;
import com.androidhero.dagger2test.module.ApplicationModule;

/**
 * Created by feliperohde on 2/27/16.
 */
public class AndroidApplication extends Application {
    private ApplicationComponent mApplicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mApplicationComponent = DaggerApplicationComponent.builder().applicationModule(new ApplicationModule(this)).build();
    }

    public ApplicationComponent getmApplicationComponent() {
        return  mApplicationComponent;
    }
}
