package com.babik.pet.toyCommerce.service;

import com.babik.pet.toyCommerce.model.Category;

import java.util.List;
import java.util.Optional;

public interface CategorySerivce {
    List<Category> listCategories();

    Category readCategory(String categoryName);
    Optional<Category> readCategory(Integer categoryId);

    void createCategory(Category category);

    void updateCategory(Integer categoryID, Category category);
}
