package com.babik.pet.toyCommerce.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;

@Entity
@Table(name = "categories")
public class Category {

    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Getter
    @Column(name = "category_name")
    private  String categoryName;
    @Getter
    @Column(name="description")
    private  String description;
    @Getter
    @Column(name="imageUrl")
    private String imageUrl;
    @OneToMany(mappedBy="categoryId")
    private Set<Product> products;

    public Category() {
    }

    public Category( String categoryName,  String description) {
        this.categoryName = categoryName;
        this.description = description;
    }

    public Category( String categoryName,  String description,  String imageUrl) {
        this.categoryName = categoryName;
        this.description = description;
        this.imageUrl = imageUrl;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "User {category id=" + id + ", category name='" + categoryName + "', description='" + description + "'}";
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}