package com.allodel.recyclerviewespresso;

import androidx.test.espresso.Espresso;

import androidx.test.espresso.contrib.RecyclerViewActions;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.longClick;
import static androidx.test.espresso.matcher.ViewMatchers.withId;


@RunWith(AndroidJUnit4.class)
public class MainActivityTest {


    @Rule
    public ActivityTestRule<MainActivity> activityActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testRecycleItemClick(){
        Espresso.onView(withId(R.id.rv_contacts)).perform(RecyclerViewActions.actionOnItemAtPosition(2,click()));
    }

    @Test
    public void testRecycleItemLongClick(){
        Espresso.onView(withId(R.id.rv_contacts)).perform(RecyclerViewActions.actionOnItemAtPosition(1,longClick()));
    }
}