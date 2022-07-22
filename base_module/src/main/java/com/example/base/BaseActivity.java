package com.example.base;

import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.utils.SystemUiUtils;


//基类 充当所有活动父类做公共处理
public abstract class BaseActivity extends AppCompatActivity {

  protected abstract int getLayout();
  protected abstract int getWindowBarColor();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //应用只做竖屏处理
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        SystemUiUtils.commonInit(this,false,getWindowBarColor());
        setContentView(getLayout());
    }
}