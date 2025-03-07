package com.mycode.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    public CricketCoach(){
        System.out.println("In Constructor: " + getClass().getSimpleName());
    }

    //define init method

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 mins:)";
    }
}

