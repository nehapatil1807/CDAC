package com.myschool.dependency;
//scope=prototype , derived id by SC

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component//id=swimmingCoach
@Scope(value ="prototype")
public class SwimmingCoach implements Coach {

    public SwimmingCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 1000 meters as a warm up";
    }
}
