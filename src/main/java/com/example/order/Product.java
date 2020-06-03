package com.example.order;

import javax.persistence.*;

@Entity
@Table(name="product_table")
public class Product {
    @Id @GeneratedValue
    Long id;
    String name;
    int stock;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
