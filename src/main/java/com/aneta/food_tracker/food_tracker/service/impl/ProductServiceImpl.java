package com.aneta.food_tracker.food_tracker.service.impl;

import com.aneta.food_tracker.food_tracker.entity.Product;
import com.aneta.food_tracker.food_tracker.repository.ProductRepository;
import com.aneta.food_tracker.food_tracker.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product getOne(Long id) {
        return productRepository.findById(id).get();
    }

    @Override
    public List<Product> getAll() {
        Iterable<Product> all = productRepository.findAll();
        List<Product> products = new ArrayList<>();
        for (Product p : all) {
            products.add(p);
        }
        return products;
    }

    @Override
    public Product updateProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public void delete(Long id) {
        productRepository.deleteById(id);
    }
}
