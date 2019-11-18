package com.aneta.food_tracker.food_tracker.entity;


import javax.persistence.*;
import java.util.List;

@Entity
@SequenceGenerator(name = "idGenerator", sequenceName = "meal_id_seq")
public class Meal extends AbstractEntity {

    @Column
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_day")
    private Day day;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "meal")
    private List<Product> products;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Day getDay() {
        return day;
    }

    public void setDay(Day day) {
        this.day = day;
    }
}
