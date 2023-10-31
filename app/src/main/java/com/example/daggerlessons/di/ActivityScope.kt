package com.example.daggerlessons.di

import java.lang.annotation.Documented
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import javax.inject.Scope

@Scope
@Documented
@Retention(RetentionPolicy.RUNTIME)
/*
    Creating a new scope which will be used for Activity level injection
 */
annotation class ActivityScope()
