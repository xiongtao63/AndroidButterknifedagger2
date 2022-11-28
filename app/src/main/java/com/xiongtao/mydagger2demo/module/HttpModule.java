package com.xiongtao.mydagger2demo.module;

import com.xiongtao.mydagger2demo.object.HttpObject;
import com.xiongtao.mydagger2demo.scope.AppScope;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@AppScope
@Module
public class HttpModule {
    @AppScope
    @Provides
    public HttpObject providerHttpObject(){
        return new HttpObject();
    }
}
