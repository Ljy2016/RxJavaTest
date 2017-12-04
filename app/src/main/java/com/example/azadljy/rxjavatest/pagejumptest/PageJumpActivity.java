package com.example.azadljy.rxjavatest.pagejumptest;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.azadljy.rxjavatest.R;

import java.io.Serializable;

import javax.inject.Inject;

import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;

public class PageJumpActivity extends AppCompatActivity {
    private TextView tv_info;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        AComponent build = DaggerAComponent.builder().aModel(new AModel()).build();
        tv_info = (TextView) findViewById(R.id.tv_info);
        build.inject(tv_info);
    }

    public void go(View view) {
        Intent intent = new Intent(PageJumpActivity.this, A.class);
        startActivity(intent);
    }


//    Observer<String> observer = new Observer<String>() {
//        @Override
//        public void onSubscribe(@NonNull Disposable d) {
//
//        }
//
//        @Override
//        public void onNext(@NonNull String s) {
//            tv_info.setText(s);
//        }
//
//        @Override
//        public void onError(@NonNull Throwable e) {
//
//        }
//
//        @Override
//        public void onComplete() {
//
//        }
//    };
}
