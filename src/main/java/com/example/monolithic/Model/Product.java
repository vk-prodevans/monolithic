package com.example.monolithic.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
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

