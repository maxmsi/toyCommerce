package com.babik.pet.toyCommerce.repository;

import com.babik.pet.toyCommerce.model.Product;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    @Override
    List<Product> findAll();
}
