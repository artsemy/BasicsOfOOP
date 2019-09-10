package com.company.dragon;

import java.util.Random;

public class Treasure {

    private String name;
    private int price;

    public Treasure() {
        name = "noName";
        price = 0;
    }

    public Treasure(int i){
        Random r = new Random();
        String[] mass = {"TV", "fridge", "electric kettle",
                "microwave", "electric stove", "oven", "laptop",
                "smartphone", "game console", "PC"};
        name = mass[i%10];
        price = r.nextInt(101) + 100;
    }

    public Treasure(String name, int price) {
        this.name = name;
        this.price = price;
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
        return "name='" + name + '\'' + ", price=" + price;
    }
}
