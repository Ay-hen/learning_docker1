package com.ayoub.docker_demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ayoub.docker_demo.model.Product;
import com.ayoub.docker_demo.service.ProductService;

@RestController
@RequestMapping("/api")
public class firstController {

    private final ProductService productService;

    public firstController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello from Spring Boot!";
    }

    @PostMapping("/add-product")
    public ResponseEntity<Product> addProduct(
            @RequestBody Product product) {

        Product savedProduct = productService.addProduct(product);

        return ResponseEntity.status(201).body(savedProduct);
    }

    @GetMapping ("/products")
    public ResponseEntity<?> getAllProducts() {
        return ResponseEntity.ok(productService.getAllProducts());
    }
}