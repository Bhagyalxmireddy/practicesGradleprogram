package com.dummytest;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalayserTest {
    @Test
    public void testAnalaysMood() {
       MoodAnalayser moodanalayser = new MoodAnalayser();
       String mood = moodanalayser.analyseMood("this is Sad message");
       Assert.assertEquals("SAD",mood);
    }

    @Test
    public void testHappyMood() {
        MoodAnalayser moodanalayser = new MoodAnalayser();
        String mood = moodanalayser.analyseMood ("this is Happy message");
        Assert.assertEquals("HAPPY",mood);
    }

}
