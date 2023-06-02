package com.babik.pet.toyCommerce.service;

import com.babik.pet.toyCommerce.dto.ProductDto;
import com.babik.pet.toyCommerce.model.Category;
import com.babik.pet.toyCommerce.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;

public interface ProductService {
    void addProduct(ProductDto productDto, Category category);
}
