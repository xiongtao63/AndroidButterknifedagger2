package com.example.dagger2_demo_20200225.di.presenter_id;
import com.example.dagger2_demo_20200225.MainActivity;
import com.example.dagger2_demo_20200225.SecActivity;
import com.example.dagger2_demo_20200225.scope.Userscope;

import javax.inject.Singleton;

import dagger.Component;
@Userscope
@Component(modules = {PresenterModule.class})
public interface PresenterComponent {
    //使用依赖关系，就不再使用这种方式
//   void injectMainActivity(MainActivity mainActivity);
//   void injectMainActivity(SecActivity secActivity);
    public Presenter providePrsenter();

}
