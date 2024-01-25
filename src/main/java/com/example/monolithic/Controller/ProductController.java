package com.example.monolithic.Controller;

import com.example.monolithic.Model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ProductController {

    @GetMapping("/product")
    public Product getProduct() {
        // Hardcoded product details
        Product product = new Product();

        return product;
    }
}

