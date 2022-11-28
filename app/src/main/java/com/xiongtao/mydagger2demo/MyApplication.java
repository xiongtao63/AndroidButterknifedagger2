package com.xiongtao.mydagger2demo;

import android.app.Application;

import com.xiongtao.mydagger2demo.component.DaggerMyComponent;
import com.xiongtao.mydagger2demo.component.MyComponent;
import com.xiongtao.mydagger2demo.di.present_id.DaggerPresenterComponent;
import com.xiongtao.mydagger2demo.module.DataBaseModule;
import com.xiongtao.mydagger2demo.module.HttpModule;

public class MyApplication extends Application {
    private MyComponent myComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        myComponent = DaggerMyComponent.builder().httpModule(new HttpModule())
                .dataBaseModule(new DataBaseModule())
                .presenterComponent(DaggerPresenterComponent.create())
                .build();
    }

    public MyComponent getMyComponent() {
        return myComponent;
    }
}
