package com.babik.pet.toyCommerce.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

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

import lombok.Getter;

@Entity
@Table(name= "product")
public class Product {

    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Getter
    @Column(name = "productName")
    @Basic(optional = false)
    private String productName;

    @Getter
    @Column(name = "description")
    private String description;

    @Getter
    @Column(name = "imageUrl")
    private String imageUrl;

    @Getter
    @Column(name = "price")
    private Integer price;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name="category_id",nullable = false)
    Category categoryId;

    public Product(String productName, String description, String imageUrl, Integer price, Category category) {
        this.productName = productName;
        this.description = description;
        this.imageUrl = imageUrl;
        this.price = price;
        this.categoryId = category;
    }

    public Product() {

    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Category getCategory() {
        return categoryId;
    }

    public void setCategory(Category category) {
        this.categoryId = category;
    }
}
