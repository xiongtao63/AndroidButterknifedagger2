package com.example.dagger2_demo_20200225;

import com.example.dagger2_demo_20200225.object.HttpObject;
import com.example.dagger2_demo_20200225.scope.Appscope;
import com.example.dagger2_demo_20200225.scope.Userscope;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * 这个类用来提供对象
 */
@Appscope
@Module
public class HttpModule {

    @Appscope
    @Provides
    public HttpObject providerHttpObject(){
        return new HttpObject();
    }
}










