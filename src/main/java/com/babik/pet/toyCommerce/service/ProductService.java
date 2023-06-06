package com.babik.pet.toyCommerce.service;

import com.babik.pet.toyCommerce.dto.ProductDto;
import com.babik.pet.toyCommerce.entity.Category;

public interface ProductService {
    void addProduct(ProductDto productDto, Category category);
}
