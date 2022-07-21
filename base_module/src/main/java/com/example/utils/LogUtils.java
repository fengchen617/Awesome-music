package com.example.utils;

import android.text.TextUtils;
import android.util.Log;

public class LogUtils {
    //todo 后期加入项目配置设置获取
    private static boolean LOG_DEBUG = true;

    public static void v(String tag,String msg){
        if (LOG_DEBUG && !TextUtils.isEmpty(msg)){
            Log.i(tag,msg);
        }
    }

    public static void d(String tag,String msg){
        if (LOG_DEBUG && !TextUtils.isEmpty(msg)){
            Log.d(tag,msg);
        }
    }

    public static void i(String tag,String msg){
        if (LOG_DEBUG && !TextUtils.isEmpty(msg)){
            Log.i(tag,msg);
        }
    }

    public static void w(String tag,String msg){
        if (LOG_DEBUG && !TextUtils.isEmpty(msg)){
            Log.i(tag,msg);
        }

    }

    public static void e(String tag,String msg){
        if (LOG_DEBUG && !TextUtils.isEmpty(msg)){
            Log.e(tag,msg);
        }
    }
}
