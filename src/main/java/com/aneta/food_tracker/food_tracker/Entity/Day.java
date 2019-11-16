package com.aneta.food_tracker.food_tracker.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@SequenceGenerator(name = "idGenerator", sequenceName = "day_id_seq")
public class Day extends AbstractEntity {

    @Column
    private String name;

    @Column
    private LocalDateTime time;

    private Set<Meal> mealSet;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Meal> getMealSet() {
        return mealSet;
    }

    public void setMealSet(Set<Meal> mealSet) {
        this.mealSet = mealSet;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }
}
