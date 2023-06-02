package com.babik.pet.toyCommerce.api.controller;

import com.babik.pet.toyCommerce.api.ApiResponse;
import com.babik.pet.toyCommerce.dto.ProductDto;
import com.babik.pet.toyCommerce.model.Category;
import com.babik.pet.toyCommerce.service.CategorySerivce;
import com.babik.pet.toyCommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.Optional;

@RestController
@RequestMapping(value = "/product")
public class ProductApiController {
    @Autowired
    ProductService productService;
    @Autowired
    CategorySerivce categoryService ;
    @PostMapping("/add")
    public ResponseEntity<ApiResponse> addProduct(@RequestBody ProductDto productDto) {
        Optional<Category> optionalCategory = categoryService.readCategory(productDto.getCategoryId());
        if (!optionalCategory.isPresent()) {
            return new ResponseEntity<ApiResponse>(new ApiResponse(false, "category is invalid"), HttpStatus.CONFLICT);
        }
        Category category = optionalCategory.get();
        productService.addProduct(productDto, category);
        return new ResponseEntity<>(new ApiResponse(true, "Product has been added"), HttpStatus.CREATED);
    }
}

