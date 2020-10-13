package com.test.jetpack.startup;

import android.content.Context;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.startup.Initializer;
import androidx.work.WorkManager;


import com.test.jetpack.Logger;

import java.util.ArrayList;
import java.util.List;

/**
 * 演示App Startup
 */
public class LoggerInitializer implements Initializer<Logger> {

    @NonNull
    @Override
    public Logger create(@NonNull Context context) {
        Logger.init(WorkManager.getInstance(context));
        Log.d("hello", "LoggerInitializer");
        return Logger.getInstance();
    }

    @NonNull
    @Override
    public List<Class<? extends Initializer<?>>> dependencies() {
        List<Class<? extends Initializer<?>>> dependencies = new ArrayList<>();
        dependencies.add(WorkManagerInitializer.class);
        return dependencies;
    }
}
