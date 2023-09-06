package com.babik.pet.toyCommerce.service;

import com.babik.pet.toyCommerce.dto.ProductDto;
import com.babik.pet.toyCommerce.entity.Category;
import com.babik.pet.toyCommerce.entity.Product;
import com.babik.pet.toyCommerce.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
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
    public Optional<Product> getProduct(Integer id) {
        return productRepository.findById(id);
    }
    @Override
    public List<Product> listProducts() {
        return productRepository.findAll();
    }
}
