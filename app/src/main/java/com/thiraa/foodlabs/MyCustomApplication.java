package com.thiraa.foodlabs;

import android.app.Application;
import android.content.Context;

public class MyCustomApplication extends Application {
    public static Context applicationContext;
    // Called when the application is starting, before any other application objects have been created.
    // Overriding this method is totally optional!

    @Override
    public void onCreate() {
        super.onCreate();
        applicationContext = getApplicationContext();
        // Required initialization logic here!
    }
}
