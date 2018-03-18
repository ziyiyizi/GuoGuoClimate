package com.guoguoclimate.android;

import android.app.Application;
import android.content.Context;

import org.litepal.LitePalApplication;

/**
 * Created by ziyi on 2018/3/17.
 */

public class MyApplication extends Application {
    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
        LitePalApplication.initialize(context);
    }

    public static Context getContext(){
        return context;
    }
}
