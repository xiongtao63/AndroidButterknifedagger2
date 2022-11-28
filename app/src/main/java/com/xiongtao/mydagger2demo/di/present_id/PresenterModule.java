package com.xiongtao.mydagger2demo.di.present_id;

import com.xiongtao.mydagger2demo.scope.UserScope;

import dagger.Module;
import dagger.Provides;

@UserScope
@Module
public class PresenterModule {

    @UserScope
    @Provides
    public Presenter providePresenter(){
        return new Presenter();
    }
}
