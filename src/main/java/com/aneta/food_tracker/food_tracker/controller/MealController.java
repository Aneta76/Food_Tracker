package com.aneta.food_tracker.food_tracker.controller;

import com.aneta.food_tracker.food_tracker.entity.Meal;
import com.aneta.food_tracker.food_tracker.entity.Product;
import com.aneta.food_tracker.food_tracker.service.MealService;
import com.aneta.food_tracker.food_tracker.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/meal")
public class MealController {

    private final MealService mealService;
    private final ProductService productService;

    public MealController(MealService mealService, ProductService productService) {
        this.mealService = mealService;
        this.productService = productService;
    }

    @GetMapping("/{id}")
    public String getOne(@PathVariable Long id, Model model) {
        Meal one = mealService.getOne(id);
        model.addAttribute("Meal", one);
        return "mealDetails";
    }

    @GetMapping("/all")
    public String getAll(Model model) {
        List<Meal> all = mealService.getAll();
        List<Product> products = productService.getAll();
        model.addAttribute("allProducts", products);
        model.addAttribute("allMeals", all);
        return "singleDay";
    }

    @PostMapping("/add")
    public String saveMeal(Meal meal, Model model) {
        model.addAttribute(meal);
        model.addAttribute("Meal", meal);
        mealService.addMeal(meal);
        return "mealEdit";
    }

    @DeleteMapping("/{id}")
    public String deleteMeal(@PathVariable Long id) {
        mealService.delete(id);
        return "redirect:/day";
    }

}
