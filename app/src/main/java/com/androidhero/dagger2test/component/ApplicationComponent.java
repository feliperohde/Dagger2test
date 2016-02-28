package com.androidhero.dagger2test.component;

import android.content.SharedPreferences;

import com.androidhero.dagger2test.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by feliperohde on 2/27/16.
 */
@Singleton
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {

    SharedPreferences providePrefences();
}
