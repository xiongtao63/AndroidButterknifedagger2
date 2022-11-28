package com.example.dagger2_demo_20200225;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.dagger2_demo_20200225.di.presenter_id.Presenter;
import com.example.dagger2_demo_20200225.object.HttpObject;

import javax.inject.Inject;

public class SecActivity extends AppCompatActivity {

    @Inject
    HttpObject httpObject;//=new HttpObject();

    @Inject
    Presenter presenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec);


//        DaggerMyComponent.builder()
//                .httpModule(new HttpModule())
//                .databaseModule(new DatabaseModule())
//                .build()
//                //到这里就已经在内存中初始化出了module和component
//                .injectSecActivity(this);

        ((MyApplication)getApplication()).getAppComponent()
                .injectSecActivity(this);

        Log.i("jett",httpObject.hashCode()+"--sec");
        Log.i("jett",presenter.hashCode()+"pre");
    }
}
