package com.androidhero.dagger2test.module;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by feliperohde on 2/27/16.
 */
@Module
public class ApplicationModule {

    private static final String PREF_KEY = "pk";

    private Application app;

    public ApplicationModule(Application app) {
        this.app = app;
    }

    @Provides @Singleton
    public Application provideApplication() {
        return this.app;
    }

    @Provides @Singleton
    public SharedPreferences providePreferences( Application app) {
        return app.getSharedPreferences(PREF_KEY, Context.MODE_PRIVATE);
    }
}
