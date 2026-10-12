package com.ayoub.docker_demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ayoub.docker_demo.model.Product;
import com.ayoub.docker_demo.repository.ProductRepository;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product addProduct(Product product) {
        Product newProduct = Product.builder()
                .name(product.getName())
                .price(product.getPrice())
                .build();

        return productRepository.save(newProduct);
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

}