package com.example.utils;

import android.app.Activity;
import android.graphics.Color;
import android.view.View;
import android.view.Window;

import androidx.core.content.ContextCompat;

public class SystemUiUtils {
    private static boolean isNightMode  = false;
    public static void commonInit(Activity activity, boolean transparent, int color) {
        Window window = activity.getWindow();
        if (isNightMode) {
            window.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_VISIBLE
                    | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
        } else {
            window.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
                    | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
        }
        int baseBgColor = ContextCompat.getColor(activity, color);
        if (transparent) {
            window.setStatusBarColor(Color.TRANSPARENT);
        } else {
            window.setStatusBarColor(baseBgColor);
        }
        window.setNavigationBarColor(baseBgColor);
    }
}
