package com.xiongtao.mydagger2demo.component;

import com.xiongtao.mydagger2demo.MainActivity;
import com.xiongtao.mydagger2demo.SecondActivity;
import com.xiongtao.mydagger2demo.di.present_id.PresenterComponent;
import com.xiongtao.mydagger2demo.module.DataBaseModule;
import com.xiongtao.mydagger2demo.module.HttpModule;
import com.xiongtao.mydagger2demo.scope.AppScope;

import javax.inject.Singleton;

import dagger.Component;

@Component(modules = {HttpModule.class, DataBaseModule.class},dependencies = {PresenterComponent.class})
@AppScope
public interface MyComponent {
    void injectMainActivity(MainActivity activity);
    void injectSecondActivity(SecondActivity activity);
}
