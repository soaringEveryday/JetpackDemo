package com.test.jetpack.databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;

import com.test.jetpack.R;

/**
 * 1. 演示布局和绑定表达式
 * 2. 演示可观察数据绑定对象
 */
public class DataBindingActivity extends AppCompatActivity {

    private ActivityDataBindingBinding binding = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_data_binding);

        // 静态布局表达式绑定数据
        binding.setDetective(new User("Sherlock", "Holmes"));
        binding.setPresenter(new ClickPresenter());

        // 可观察绑定类
        ObservableUser user = new ObservableUser();
        user.age.set(50);
        user.firstName.set("Sherlock");
        user.lastName.set("Holmes");
        binding.setUser(user);

        // 使用LiveData代替绑定数据
        binding.setLifecycleOwner(this); // 设定谁是生命周期绑定数据的观察者
    }

    public void click(View view) {
        binding.getUser().firstName.set("Hello");
        binding.getUser().lastName.set("World");
    }
}