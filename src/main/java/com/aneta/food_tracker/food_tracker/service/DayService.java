package com.aneta.food_tracker.food_tracker.service;

import com.aneta.food_tracker.food_tracker.entity.Day;

import java.util.List;

public interface DayService {

    Day addDay(Day day);

    Day getOne(Long id);

    List<Day> getAll();

    Day updateProduct(Day day);

    void delete(Long id);
}
