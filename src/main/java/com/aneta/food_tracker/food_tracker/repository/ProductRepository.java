package com.aneta.food_tracker.food_tracker.repository;

import com.aneta.food_tracker.food_tracker.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
}
