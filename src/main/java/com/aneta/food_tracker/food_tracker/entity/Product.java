package com.aneta.food_tracker.food_tracker.entity;


import javax.persistence.*;

@Entity
@SequenceGenerator(name = "idGenerator", sequenceName = "product_id_seq")
public class Product extends AbstractEntity {

    @Column
    private String name;

    @Column
    private Long kcalories;

    @Column
    private Long carbs;

    @Column
    private Long fats;

    @Column
    private Long protein;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_meal")
    private Meal meal;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getKcalories() {
        return kcalories;
    }

    public void setKcalories(Long kcalories) {
        this.kcalories = kcalories;
    }

    public Long getCarbs() {
        return carbs;
    }

    public void setCarbs(Long carbs) {
        this.carbs = carbs;
    }

    public Long getFats() {
        return fats;
    }

    public void setFats(Long fats) {
        this.fats = fats;
    }

    public Meal getMeal() {
        return meal;
    }

    public void setMeal(Meal meal) {
        this.meal = meal;
    }

    public Long getProtein() {
        return protein;
    }

    public void setProtein(Long protein) {
        this.protein = protein;
    }
}
