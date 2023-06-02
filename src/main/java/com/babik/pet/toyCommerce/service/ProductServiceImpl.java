package com.babik.pet.toyCommerce.service;

import com.babik.pet.toyCommerce.dto.ProductDto;
import com.babik.pet.toyCommerce.model.Category;
import com.babik.pet.toyCommerce.model.Product;
import com.babik.pet.toyCommerce.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;

public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepository productRepository;


    @Override
    public void addProduct(ProductDto productDto, Category category) {

        Product product= new Product();
        product.setCategory(category);
        product.setDescription(productDto.getDescription());
        product.setProductName(productDto.getName());
        productRepository.save(product);
    }
}
