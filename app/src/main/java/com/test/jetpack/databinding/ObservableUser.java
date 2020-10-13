package com.test.jetpack.databinding;

import androidx.databinding.ObservableField;
import androidx.databinding.ObservableInt;

public class ObservableUser {
    public final ObservableField<String> firstName = new ObservableField<>();
    public final ObservableField<String> lastName = new ObservableField<>();
    public final ObservableInt age = new ObservableInt();
}