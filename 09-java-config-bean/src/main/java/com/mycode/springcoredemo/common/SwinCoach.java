package com.mycode.springcoredemo.common;

public class SwinCoach implements Coach{

    public SwinCoach(){
        System.out.println("In Constructor: " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout(){
        return "Swin 1000 mtrs as a warm up!!!";
    }
}
