package com.xiongtao.mydagger2demo.scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import javax.inject.Scope;

@Scope
@Documented
@Retention(RUNTIME)
public @interface UserScope {}