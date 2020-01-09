package com.aneta.food_tracker.food_tracker.controller;

import com.aneta.food_tracker.food_tracker.entity.Product;
import com.aneta.food_tracker.food_tracker.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping({"/", ""})
    public String showProductList() {
        return "redirect:/product/all";
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

    @GetMapping("/all")
    public String getProductList(Model model) {
        List<Product> allProducts = productService.getAll();
        model.addAttribute("productList", allProducts);
        return "productList";
    }

    @GetMapping("/{id}")
    public String getOneProduct(Model model, @PathVariable Long id) {
        Product oneProduct = productService.getOne(id);
        model.addAttribute("oneProduct", oneProduct);
        return "productDetails";
    }

    @PostMapping("/update/{id}")
    public String editProduct(@PathVariable Long id, Model model) {
        Product productToEdit = productService.getOne(id);
        model.addAttribute("editedProduct", productToEdit);
        model.addAttribute("button", "Save Changes");
        return "productEdit";
    }

    @PostMapping("/update")
    public String updateProduct(Product product) {
        Product updated;
        if (product.getId() != null) {
            updated = productService.updateProduct(product);
        } else {
            updated = productService.addProduct(product);
        }
        return "redirect:/product/" + updated.getId();
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable Long id) {
        productService.delete(id);
        return "redirect:/product/all";
    }
}
