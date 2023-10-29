package com.example.daggerlessons.di

import com.example.daggerlessons.model.Body
import com.example.daggerlessons.model.FiberBody
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
interface BodyModule {
    @Binds
    /*
    Here with the help of module we convey dagger which Body implementation
    to use whevenever a Body is asked for
     */
    fun getBody(body: FiberBody): Body

    //Above binds can be written in more verbose way as below.
   /* @Provides
    fun getBody(body: FiberBody): Body {
        return body
    }*/
}