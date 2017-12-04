package com.example.azadljy.rxjavatest.pagejumptest;

import android.widget.TextView;

import org.w3c.dom.Text;

import dagger.Component;

/**
 * 作者：Ljy on 2017/12/4.
 * 功能：我的——我的资料
 */

@Component(modules = AModel.class)
public interface AComponent {
    void inject(TextView textView);
}
