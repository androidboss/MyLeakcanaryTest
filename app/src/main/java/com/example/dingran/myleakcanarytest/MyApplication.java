package com.example.dingran.myleakcanarytest;

import android.app.Application;
import com.squareup.leakcanary.LeakCanary;

/**
 * Created by dingran on 2016/1/18.
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        LeakCanary.install(this);
    }
}
