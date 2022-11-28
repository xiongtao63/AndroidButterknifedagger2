package com.xiongtao.butterknife_framework;

import android.app.Activity;

public class MyButterKnife {
    public static void bind(Activity activity){
        String name = activity.getClass().getName()+"_ViewBinding";
        try {
            Class<?> aClass = Class.forName(name);
            IBinder binder = (IBinder) aClass.newInstance();
            binder.bind(activity);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
