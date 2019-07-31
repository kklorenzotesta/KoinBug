package com.example.koinbug

import androidx.test.rule.ActivityTestRule
import org.junit.Rule
import org.junit.Test
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.koinApplication
import org.koin.test.check.checkModules

class Tests {
    @get:Rule
    val activityRule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun checkKoinModules() {
        koinApplication {
            androidContext(androidx.test.platform.app.InstrumentationRegistry.getInstrumentation().context)
            modules(KoinBug.modules)
        }.checkModules()
    }

    @Test
    fun fooTest() {
    }
}
