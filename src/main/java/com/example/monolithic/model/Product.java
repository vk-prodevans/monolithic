package com.example.monolithic.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Product {
    private String name;
    private double price;
    private String brand;




    public Product() {
        this.name = "bat";
        this.price = 20000;
        this.brand = "kokaburra";
    }
}

