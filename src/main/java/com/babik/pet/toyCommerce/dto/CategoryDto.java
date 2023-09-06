package com.babik.pet.toyCommerce.dto;
import com.sun.istack.NotNull;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


public class CategoryDto {

    private @NotNull Integer id;

    private  @NotNull String categoryName;

    private  @NotNull String description;

    private @NotNull String imageUrl;


}
