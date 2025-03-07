package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @Value("${coach.name}")
    private String coachName;
    @Value("${food.name}")
    private String foodName;

    @GetMapping("/foodinfo")
    public String foodInfo(){
        return "Coach= " + coachName + " , Food= " + foodName;
    }

    @GetMapping("/")
    public String sayHello() {
        return "Hello World";
    }

    //adding new endpoint
    @GetMapping("/workout")
        public String getDailyWorkout(){
            return "Run hard 5k!";
    }

    //adding new endpoint
    @GetMapping("/fortune")
    public String getDailyFortune(){
        return "Today is your lucky day";
    }

}
