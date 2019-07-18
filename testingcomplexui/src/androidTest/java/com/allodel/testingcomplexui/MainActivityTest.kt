package com.allodel.testingcomplexui
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.matcher.ViewMatchers.isAssignableFrom
 import androidx.test.espresso.assertion.ViewAssertions.matches

import android.content.Context
import android.view.View
import android.widget.Toolbar
import androidx.test.core.app.ApplicationProvider
import androidx.test.espresso.ViewAssertion
import androidx.test.espresso.ViewInteraction
import androidx.test.espresso.matcher.BoundedMatcher
import androidx.test.rule.ActivityTestRule
import androidx.test.runner.AndroidJUnit4
import org.hamcrest.Description
import org.hamcrest.Matcher
import org.hamcrest.core.Is.`is`
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class MainActivityTest{
    @get:Rule
    val activityTestRule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun toolbarTitle(){
        val title = ApplicationProvider.getApplicationContext<Context>().getString(R.string.app_name)
        matchToolbarTitle(title)
    }

    private fun matchToolbarTitle(title: CharSequence):ViewInteraction {
        return onView(isAssignableFrom(Toolbar::class.java))
            .check(matches(withToolbarTitle(`is`(title))))
    }

    private fun withToolbarTitle(textMatcher: Matcher<CharSequence>): Matcher<Any>? {
        return object :BoundedMatcher<Any, Toolbar>(Toolbar::class.java){

            override fun matchesSafely(item: Toolbar): Boolean {
                return  textMatcher.matches(item.title)

            }

            override fun describeTo(description: Description) {
                description.appendText("With Toolbar Title")
                textMatcher.describeTo(description)
            }


        }


    }
}