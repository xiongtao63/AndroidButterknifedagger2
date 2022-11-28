package com.xiongtao.mydagger2demo.di.present_id;

import com.xiongtao.mydagger2demo.scope.UserScope;

import dagger.Component;
@UserScope
@Component(modules = {PresenterModule.class})
public interface PresenterComponent {
    //使用依赖关系，就不再使用这种方式
//   void injectMainActivity(MainActivity mainActivity);
//   void injectMainActivity(SecActivity secActivity);
    public Presenter providePrsenter();
}
