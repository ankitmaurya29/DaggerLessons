package com.example.daggerlessons.di

import javax.inject.Inject
/*
    Adding constructor injection. by doing so we add this objec to
    dependency graph and dagger can use it to provide us the dependency when used.
 */
class Car @Inject constructor() {
}