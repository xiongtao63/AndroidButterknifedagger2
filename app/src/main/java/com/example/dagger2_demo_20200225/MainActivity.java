package com.example.dagger2_demo_20200225;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.dagger2_demo_20200225.di.presenter_id.Presenter;
import com.example.dagger2_demo_20200225.object.DatabaseObject;
import com.example.dagger2_demo_20200225.object.HttpObject;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    HttpObject httpObject;//=new HttpObject();
    @Inject
    HttpObject httpObject2;//=new HttpObject();
    @Inject
    DatabaseObject databaseObject;

    @Inject
    Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        DaggerMyComponent.create().injectMainActivity(this);
//        DaggerMyComponent.builder()
//                .httpModule(new HttpModule())
//                .databaseModule(new DatabaseModule())
//                .build()
//                //到这里就已经在内存中初始化出了module和component
//                .injectMainActivity(this);

        ((MyApplication)getApplication()).getAppComponent()
                .injectMainActivity(this);

        Log.i("jett",httpObject.hashCode()+"");
        Log.i("jett",httpObject2.hashCode()+"");
        Log.i("jett",databaseObject.hashCode()+"");
        Log.i("jett",presenter.hashCode()+"pre");
    }

    public void click(View view) {
        startActivity(new Intent(this,SecActivity.class));
    }
}
