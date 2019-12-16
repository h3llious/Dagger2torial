package com.eastagile.dagger2torial

import dagger.Component

@Component(modules = [MainActivityModule::class])
interface InfoComponent {
    fun inject(app: MainActivity)
}
