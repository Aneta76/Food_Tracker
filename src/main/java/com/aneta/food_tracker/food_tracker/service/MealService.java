package com.aneta.food_tracker.food_tracker.service;

import com.aneta.food_tracker.food_tracker.entity.Meal;

import java.util.List;

public interface MealService {

    Meal addMeal(Meal meal);

    Meal getOne(Long id);

    List<Meal> getAll();

    Meal updateProduct(Meal meal);

    void delete(Long id);

}
