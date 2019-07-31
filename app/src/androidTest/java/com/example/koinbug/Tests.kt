package com.example.koinbug

import androidx.test.rule.ActivityTestRule
import org.junit.FixMethodOrder
import org.junit.Rule
import org.junit.Test
import org.junit.runners.MethodSorters
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.koinApplication
import org.koin.test.check.checkModules

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class Tests {
    @get:Rule
    val activityRule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun t1_checkKoinModules() {
        koinApplication {
            androidContext(androidx.test.platform.app.InstrumentationRegistry.getInstrumentation().context)
            modules(KoinBug.modules)
        }.checkModules()
    }

    @Test
    fun t2_fooTest() {
    }
}
