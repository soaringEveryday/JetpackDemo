package com.test.jetpack.lifecycle;

import android.content.Context;
import android.widget.Toast;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

public class LocalSomethingListener implements LifecycleObserver {
    private boolean enabled = false;
    private final Lifecycle lifecycle;
    private final Context context;

    public LocalSomethingListener(Context context, Lifecycle lifecycle) {
        this.lifecycle = lifecycle;
        this.context = context.getApplicationContext();
    }

    public void enable() {
        if (lifecycle.getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            enabled = true;
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void start() {
        if (enabled) {
            Toast.makeText(context, "started", Toast.LENGTH_SHORT).show();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void stop() {
        if (enabled) {
            Toast.makeText(context, "stopped", Toast.LENGTH_SHORT).show();
        }
    }
}
