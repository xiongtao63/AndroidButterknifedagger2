package com.example.dagger2_demo_20200225;

import android.app.Application;

import com.example.dagger2_demo_20200225.di.presenter_id.DaggerPresenterComponent;

public class MyApplication extends Application {
    private MyComponent myComponent;
    @Override
    public void onCreate() {
        super.onCreate();
        myComponent=DaggerMyComponent.builder()
                .httpModule(new HttpModule())
                .databaseModule(new DatabaseModule())
                .presenterComponent(DaggerPresenterComponent.create())
                .build();
    }
    public MyComponent getAppComponent(){return myComponent;}
}
