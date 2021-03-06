package com.liferay.mobile.screens.testapp;

import android.app.Application;
import com.squareup.leakcanary.LeakCanary;

/**
 * @author Javier Gamarra
 */
public class TestApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        LeakCanary.install(this);
    }
}
