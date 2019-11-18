package com.aneta.food_tracker.food_tracker.repository;

import com.aneta.food_tracker.food_tracker.entity.Day;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DayRepository extends CrudRepository<Day, Long> {
}
