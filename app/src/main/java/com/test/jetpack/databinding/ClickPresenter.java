package com.test.jetpack.databinding;

import android.util.Log;

public class ClickPresenter {
    private static final String TAG = "ClickPresenter";
    public void onClick(User user) {
        Log.e(TAG, "My first name is " + user.getFirstName());
    }
}
