package com.dummytest;

public class MoodAnalayser {
    public String analyseMood(String meassage) {
        if(meassage.contains(("Sad"))) {
            return "SAD";
        }else{
            return "HAPPY";
        }
    }
}
