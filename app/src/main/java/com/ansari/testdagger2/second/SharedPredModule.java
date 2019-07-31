package com.ansari.testdagger2.second;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class SharedPredModule {


    private Context context;

    public SharedPredModule(Context context) {
        this.context = context;
    }
    @Singleton
    @Provides
    Context provideContext() {

        return context;

    }

    @Singleton
    @Provides
    SharedPreferences provideSharedPreferences() {

        return PreferenceManager.getDefaultSharedPreferences(context);
    }
}
