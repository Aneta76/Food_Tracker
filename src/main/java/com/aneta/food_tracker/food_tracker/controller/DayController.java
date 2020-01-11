package com.aneta.food_tracker.food_tracker.controller;

import com.aneta.food_tracker.food_tracker.entity.Day;
import com.aneta.food_tracker.food_tracker.service.DayService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/day")
public class DayController {

    private final DayService dayService;

    public DayController(DayService dayService) {
        this.dayService = dayService;
    }

    @PostMapping("/add")
    public String addDay(Day day, Model model) {
        model.addAttribute("day", day);
        dayService.addDay(day);
        return "someTemplate";
    }

    @GetMapping("/{id}")
    public String getOne(@PathVariable Long id, Model model) {
        Day oneDay = dayService.getOne(id);
        model.addAttribute("day", oneDay);
        return "singleDay";
    }
}
