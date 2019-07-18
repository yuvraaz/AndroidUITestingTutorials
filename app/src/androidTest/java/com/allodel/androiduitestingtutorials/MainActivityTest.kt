package com.allodel.androiduitestingtutorials

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.rule.ActivityTestRule
 import org.junit.Test

 import org.junit.Rule

  class MainActivityTest {

      @get:Rule
      val activityTestRule = ActivityTestRule(MainActivity::class.java)


    @Test
    fun onCreate() {
      //Test views
        onView(withId(R.id.tv_quote_login))
            .check(matches(withText(R.string.quote_login)))

        onView(withId(R.id.tv_message))
            .check(matches(withText("")))

        onView(withId(R.id.et_email))
            .check(matches(withText("")))
        onView(withId(R.id.et_password))
            .check(matches(withText("")))

        onView(withId(R.id.btn_login))
            .check(matches(withText(R.string.lbl_login)))

    }

    @Test
    fun validationsuccess() {

        onView(withId(R.id.btn_login))
            .perform(click())

        onView(withId(R.id.tv_message))
            .check(matches(withText(R.string.lbl_validation_success)))



    }

}