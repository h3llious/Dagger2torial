package com.eastagile.dagger2torial

import dagger.Component

@Component()
interface InfoComponent {
    fun inject(app: MainActivity)
}
