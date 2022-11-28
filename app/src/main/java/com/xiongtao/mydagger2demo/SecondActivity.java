package com.xiongtao.mydagger2demo;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.xiongtao.mydagger2demo.component.DaggerMyComponent;
import com.xiongtao.mydagger2demo.di.present_id.Presenter;
import com.xiongtao.mydagger2demo.module.DataBaseModule;
import com.xiongtao.mydagger2demo.module.HttpModule;
import com.xiongtao.mydagger2demo.object.HttpObject;

import javax.inject.Inject;

public class SecondActivity extends AppCompatActivity {
    @Inject
    HttpObject httpObject;
    @Inject
    Presenter presenter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

//        DaggerMyComponent.builder().httpModule(new HttpModule())
//                .dataBaseModule(new DataBaseModule())
//                .build()
//                //到这里就已经在内存中初始化出了module和component
//                .injectSecondActivity(this);
        ((MyApplication)getApplication()).getMyComponent().injectSecondActivity(this);

        Log.i("jett",httpObject.hashCode()+"--sec");
        Log.i("jett",presenter.hashCode()+"pre");
    }
}
