package com.mycode.springcoredemo.rest;


import com.mycode.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach myCoach;


    //we can give any method name and still it works
    @Autowired
    public DemoController(@Qualifier("aquatic") Coach theCoach)

    {
        System.out.println("In Constructor: " + getClass().getSimpleName());
        myCoach = theCoach;

    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }



}
