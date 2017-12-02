package com.example.azadljy.rxjavatest.pagejumptest;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.azadljy.rxjavatest.R;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;

public class A extends AppCompatActivity {
    private EditText et_info;
    public static Observer observer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        et_info = (EditText) findViewById(R.id.et_info);
    }

    public void go(View view) {
        finish();
    }

    @Override
    public void finish() {
        super.finish();
        observable.subscribe(observer);
    }

    Observable<String> observable = Observable.create(new ObservableOnSubscribe<String>() {
        @Override
        public void subscribe(@NonNull ObservableEmitter<String> e) throws Exception {
            e.onNext(et_info.getText().toString());
            e.onComplete();
        }
    });

}
