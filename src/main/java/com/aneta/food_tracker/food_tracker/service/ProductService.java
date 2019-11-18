package com.aneta.food_tracker.food_tracker.service;

import com.aneta.food_tracker.food_tracker.entity.Product;

import java.util.List;

public interface ProductService {

    Product addProduct(Product product);

    Product getOne(Long id);

    List<Product> getAll();

    Product updateProduct(Product product);

    void delete(Long id);
}
