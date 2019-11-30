package com.aneta.food_tracker.food_tracker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

    @GetMapping({"/",""})
    public String showMainPage(){
        return "index";
    }


}
