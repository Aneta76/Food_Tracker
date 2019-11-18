package com.aneta.food_tracker.food_tracker.controller;

import com.aneta.food_tracker.food_tracker.entity.Product;
import com.aneta.food_tracker.food_tracker.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/product")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/add")
    public String addProduct(Model model, Product product) {
        model.addAttribute(product);
        model.addAttribute("product", product);
        model.addAttribute("title", "Creation");
        model.addAttribute("button", "Create product");
        productService.addProduct(product);
        return "productEdit";
    }

    //read

    // update

    //delete

}
