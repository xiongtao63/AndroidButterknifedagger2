package com.example.dagger2_demo_20200225;

import com.example.dagger2_demo_20200225.object.DatabaseObject;
import com.example.dagger2_demo_20200225.object.HttpObject;

import dagger.Module;
import dagger.Provides;

/**
 * 这个类用来提供对象
 */
@Module
public class DatabaseModule {

    @Provides
    public DatabaseObject providerDatabaseObject(){
        return new DatabaseObject();
    }
    //也可以提供其它的对象
//    @Provides
//    public Object providerObject(){
//        return new Object();
//    }
}










