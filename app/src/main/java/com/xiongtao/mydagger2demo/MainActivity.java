package com.xiongtao.mydagger2demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.xiongtao.mydagger2demo.component.DaggerMyComponent;
import com.xiongtao.mydagger2demo.component.MyComponent;
import com.xiongtao.mydagger2demo.di.present_id.Presenter;
import com.xiongtao.mydagger2demo.module.DataBaseModule;
import com.xiongtao.mydagger2demo.module.HttpModule;
import com.xiongtao.mydagger2demo.object.DatabaseObject;
import com.xiongtao.mydagger2demo.object.HttpObject;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    HttpObject httpObject;
    @Inject
    HttpObject httpObject2;

    @Inject
    DatabaseObject databaseObject;

    @Inject
    Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        DaggerMyComponent.create().injectMainActivity(this);
//        DaggerMyComponent.builder().httpModule(new HttpModule())
//                .dataBaseModule(new DataBaseModule())
//                .build().injectMainActivity(this);
       ((MyApplication) getApplication()).getMyComponent().injectMainActivity(this);
        Log.i("jett", httpObject.hashCode() + "");
        Log.i("jett", httpObject2.hashCode() + "");
        Log.i("jett", databaseObject.hashCode() + "");
        Log.i("jett",presenter.hashCode()+"pre");


        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SecondActivity.class));
            }
        });
    }

}