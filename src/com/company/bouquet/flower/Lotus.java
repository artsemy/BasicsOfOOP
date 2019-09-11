package com.company.bouquet.flower;

public class Lotus implements Flower{

    private String name;
    private int price;

    public Lotus() {
        name = "Lotus";
        price = 90;
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
        return "Lotus{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
