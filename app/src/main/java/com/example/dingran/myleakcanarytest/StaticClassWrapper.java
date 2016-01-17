package com.example.dingran.myleakcanarytest;

import android.view.View;

/**
 * Created by dingran on 2016/1/18.
 */
public class StaticClassWrapper {

    public static class MyStatic {
        private static View mStaticView;

        public static void setView(View view) {
            mStaticView = view;
        }
    }
}
