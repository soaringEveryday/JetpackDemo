package com.test.jetpack.lifecycle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.test.jetpack.R;
import com.test.jetpack.databinding.ActivityLifecycleBinding;

public class LifecycleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lifecycle);
        final LocalSomethingListener observer = new LocalSomethingListener(getApplicationContext(), getLifecycle());
        getWindow().getDecorView().postDelayed(new Runnable() {
            @Override
            public void run() {
                observer.enable();
            }
        }, 10);
        getLifecycle().addObserver(observer);
    }
}