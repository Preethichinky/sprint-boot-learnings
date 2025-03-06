package com.example.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
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
