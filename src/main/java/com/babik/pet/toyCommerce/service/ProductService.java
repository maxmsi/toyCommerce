package com.babik.pet.toyCommerce.service;

import com.babik.pet.toyCommerce.dto.ProductDto;
import com.babik.pet.toyCommerce.entity.Category;
import com.babik.pet.toyCommerce.entity.Product;

import java.util.List;

public interface ProductService {
    void addProduct(ProductDto productDto, Category category);

    List<Product> listProducts();
}
