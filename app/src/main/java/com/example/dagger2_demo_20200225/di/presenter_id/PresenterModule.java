package com.example.dagger2_demo_20200225.di.presenter_id;
import com.example.dagger2_demo_20200225.scope.Userscope;

import javax.inject.Singleton;

import androidx.core.view.ViewCompat;
import dagger.Module;
import dagger.Provides;
@Userscope
@Module
public class PresenterModule {
    @Userscope
    @Provides
    public Presenter providePresenter(){
        return new Presenter();
    }
}
