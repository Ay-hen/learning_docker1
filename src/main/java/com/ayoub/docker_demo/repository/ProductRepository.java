package com.ayoub.docker_demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ayoub.docker_demo.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}