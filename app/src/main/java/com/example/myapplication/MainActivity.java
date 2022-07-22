package com.example.myapplication;

import android.os.Bundle;

import com.example.base.BaseActivity;

public class MainActivity extends BaseActivity {

    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected int getWindowBarColor() {
        //todo 颜色定义
        return R.color.cardview_shadow_end_color;
    }

}