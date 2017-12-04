package com.example.azadljy.rxjavatest;

import android.app.Application;
import android.content.Context;

/**
 * 作者：Ljy on 2017/12/4.
 * 功能：我的——我的资料
 */


public class App extends Application {
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
//        MultiDex.install(this);

    }
}
