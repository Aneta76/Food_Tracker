package com.aneta.food_tracker.food_tracker.Repository;

import com.aneta.food_tracker.food_tracker.Entity.Day;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DayRepository extends CrudRepository<Day, Long> {
}
