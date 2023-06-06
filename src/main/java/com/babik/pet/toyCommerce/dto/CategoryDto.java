package com.babik.pet.toyCommerce.dto;

import org.antlr.v4.runtime.misc.NotNull;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class CategoryDto {

    private Integer id;

    private  @NotNull String categoryName;

    private  @NotNull String description;

    private @NotNull String imageUrl;


}
