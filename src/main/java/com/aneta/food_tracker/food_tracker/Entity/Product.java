package com.aneta.food_tracker.food_tracker.Entity;


import javax.persistence.*;

@Entity
@SequenceGenerator(name = "idGenerator", sequenceName = "user_id_seq")
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

    public Long getProtein() {
        return protein;
    }

    public void setProtein(Long protein) {
        this.protein = protein;
    }
}
