package com.eastagile.dagger2torial

import dagger.Module
import dagger.Provides
import javax.inject.Named

const val INFO1 = "Info1"
const val INFO2 = "Info2"

@Module
class MainActivityModule {
    @Provides
    fun providesInfo(): Info = Info("Dagger using Module")

//    @Provides @Named(INFO2)
//    fun providesInfo2(): Info = Info("New annotation @NAMED")
}
