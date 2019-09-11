package com.company.bouquet.flower;

public class Lily implements Flower{

    private String name;
    private int price;

    public Lily() {
        name = "Lily";
        price = 80;
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
        return "Lily{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
