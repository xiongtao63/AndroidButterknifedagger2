package com.example.dagger2_demo_20200225;

import com.example.dagger2_demo_20200225.di.presenter_id.PresenterComponent;
import com.example.dagger2_demo_20200225.scope.Appscope;

import javax.inject.Singleton;

import dagger.Component;
import dagger.Subcomponent;

/**
 * scope&dependencies的使用
 * 1.多个component上面的scope不能相同
 * 2.没有scope的组件不能去依赖有scope的组件
 */
@Component(modules = {HttpModule.class,DatabaseModule.class}
        ,dependencies = {PresenterComponent.class}
)
@Appscope
public interface MyComponent {
    //这里不能用多态
    void injectMainActivity(MainActivity activity);
    void injectSecActivity(SecActivity activity);
}
