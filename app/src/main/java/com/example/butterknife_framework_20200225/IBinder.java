package com.example.butterknife_framework_20200225;

/**
 * 用来给用户绑定activity使用
 */
public interface IBinder<T> {
    void bind(T target);
}
