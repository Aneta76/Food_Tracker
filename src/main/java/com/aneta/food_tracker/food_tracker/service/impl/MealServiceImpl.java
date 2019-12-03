package com.aneta.food_tracker.food_tracker.service.impl;

import com.aneta.food_tracker.food_tracker.entity.Meal;
import com.aneta.food_tracker.food_tracker.repository.MealRepository;
import com.aneta.food_tracker.food_tracker.service.MealService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MealServiceImpl implements MealService {

    private final MealRepository mealRepository;

    public MealServiceImpl(MealRepository mealRepository) {
        this.mealRepository = mealRepository;
    }

    @Override
    public Meal addMeal(Meal meal) {
        return mealRepository.save(meal);
    }

    @Override
    public Meal getOne(Long id) {
        Optional<Meal> mealById = mealRepository.findById(id);
        return mealById.get();
    }

    @Override
    public List<Meal> getAll() {
        Iterable<Meal> allMeals = mealRepository.findAll();
        List<Meal> meals = new ArrayList<>();
        for (Meal m : allMeals) {
            meals.add(m);
        }
        return meals;
    }

    @Override
    public Meal updateProduct(Meal meal) {
        mealRepository.save(meal);
        return meal;
    }

    @Override
    public void delete(Long id) {
        mealRepository.deleteById(id);
    }
}
