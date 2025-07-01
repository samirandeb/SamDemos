package com.ibatulanand.productservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibatulanand.productservice.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
