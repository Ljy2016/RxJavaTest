package com.example.azadljy.rxjavatest.pagejumptest;

import android.widget.TextView;

import org.w3c.dom.Text;

import dagger.Module;
import dagger.Provides;
import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;

/**
 * 作者：Ljy on 2017/12/4.
 */

@Module
public class AModel {
    @Provides
    public Observer getObserver(final TextView tv_info) {

        Observer<String> observer = new Observer<String>() {
            @Override
            public void onSubscribe(@NonNull Disposable d) {

            }

            @Override
            public void onNext(@NonNull String s) {
                tv_info.setText(s);
            }

            @Override
            public void onError(@NonNull Throwable e) {

            }

            @Override
            public void onComplete() {

            }
        };
        return observer;
    }
}
