package com.mycode.springcoredemo.config;

import com.mycode.springcoredemo.common.Coach;
import com.mycode.springcoredemo.common.SwinCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean("aquatic")
    public Coach swimCoach(){
        return new SwinCoach();
    }

}
