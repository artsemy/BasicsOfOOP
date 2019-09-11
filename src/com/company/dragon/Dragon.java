package com.company.dragon;

import java.util.Arrays;
import java.util.Comparator;

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
        System.out.println("Max price treasure is: " + treasures[index]);
    }

    public void printBySum(int sum){
        System.out.println("sum= " + sum);
        hasMore(sum, treasures);
    }

    private boolean hasMore(int sum, Treasure[] mass){
        if (mass.length < 1 && sum > 0){
            return true;
        }
        int i = 0;
        boolean b = false;
        while (!b && i < mass.length){
            Treasure t = mass[i];
            if (t.getPrice() == sum){
                System.out.println(t);
                return true;
            }
            if (t.getPrice() < sum){
                b = hasMore(sum - t.getPrice(), copyWithout1(i, mass));
                if (b){
                    System.out.println(t);
                    return true;
                }
            }
            i++;
        }
        return false;
    }

    private Treasure[] copyWithout1(int i, Treasure[] mass){
        Treasure[] res = new Treasure[mass.length-1];
        int k = 0;
        for (int j = 0; j < mass.length; j++) {
            if (j != i){
                res[k++] = mass[j];
            }
        }
        return res;
    }

    public void sortByPrice(){
        Arrays.sort(treasures, new Comparator<Treasure>() {
            @Override
            public int compare(Treasure o1, Treasure o2) {
                return Integer.compare(o1.getPrice(), o2.getPrice());
            }
        });
    }

    public void sortByName(){
        Arrays.sort(treasures, new Comparator<Treasure>() {
            @Override
            public int compare(Treasure o1, Treasure o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }
}
