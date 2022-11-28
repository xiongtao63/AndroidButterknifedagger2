package com.xiongtao.mydagger2demo.module;

import com.xiongtao.mydagger2demo.object.DatabaseObject;

import dagger.Module;
import dagger.Provides;

@Module
public class DataBaseModule {
    @Provides
    public DatabaseObject providerDatabaseObject(){
        return new DatabaseObject();
    }
}
