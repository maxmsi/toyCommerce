package com.babik.pet.toyCommerce.repository;

import com.babik.pet.toyCommerce.model.Category;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

    Category findByCategoryName(String categoryName);

}
