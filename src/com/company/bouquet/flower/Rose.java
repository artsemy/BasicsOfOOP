package com.company.bouquet.flower;

import com.company.bouquet.flower.Flower;

public class Rose implements Flower {

    private String name;
    private int price;

    public Rose() {
        name = "Rose";
        price = 100;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Rose{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
