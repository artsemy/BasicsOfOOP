package com.company.dragon;

public class Dragon {

    private Treasure[] treasures;

    public Dragon() {
        treasures = new Treasure[100];
    }

    public void loadTreasure(){
        for (int i = 0; i < treasures.length; i++) {
            treasures[i] = new Treasure(i);
        }
    }

    public void printAll(){
        for (Treasure t: treasures) {
            System.out.println(t);
        }
    }

    public void printExpensive(){
        int index = 0;
        int maxPrice = treasures[index].getPrice();
        for (int i = 1; i < treasures.length; i++) {
            if (treasures[i].getPrice() > maxPrice){
                maxPrice = treasures[i].getPrice();
                index = i;
            }
        }
        System.out.println("Max price treasure is " + treasures[index]);
    }
}
