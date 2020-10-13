package com.test.jetpack.startup;

import android.content.Context;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.startup.Initializer;
import androidx.work.Configuration;
import androidx.work.WorkManager;

import java.util.Collections;
import java.util.List;

/**
 * 演示App Startup
 */
public class WorkManagerInitializer implements Initializer<WorkManager> {
    @NonNull
    @Override
    public WorkManager create(@NonNull Context context) {
        Configuration configuration = new Configuration.Builder().build();
        WorkManager.initialize(context, configuration);
        Log.d("hello", "WorkManagerInitializer");
        return WorkManager.getInstance(context);
    }

    @NonNull
    @Override
    public List<Class<? extends Initializer<?>>> dependencies() {
        return Collections.emptyList();
    }
}
