package com.company;

import com.company.bouquet.Bouquet;
import com.company.bouquet.flower.Lily;
import com.company.bouquet.flower.Lotus;
import com.company.bouquet.flower.Rose;
import com.company.calendar.Calendar;
import com.company.dragon.Dragon;
import com.company.files.Directory;
import com.company.files.TextFile;
import com.company.payment.Payment;

import java.util.Random;
import java.util.Scanner;

public class Check {

    //class file, textFile, directory; create, rename
    //add,print content, delete file
    void func1(){
        //create textFile
        TextFile f1 = new TextFile();
        Directory d = new Directory("Novels");
        f1.create("novel1", d);
        //print name
        System.out.println(f1.getName());
        //print directory
        System.out.println(f1.getDirectory());
        //rename
        f1.rename("novel2");
        System.out.println(f1.getName());
        //print content
        f1.printContent();
        //add content
        f1.addContent("contentAdd");
        f1.printContent();
        //delete file
        f1.delete();
        //print deleted properties
        System.out.println(f1.getName());
        System.out.println(f1.getDirectory());
        System.out.println(f1.getContent());
    }

    //class payment with inner class, create purchase with some products
    void func2(){
        //create orders, add to payment
        Random r = new Random();
        Payment payment = new Payment();
        Payment.Order order = payment.new Order();
        order.setId(1);
        order.setPrice(10);
        payment.addOrder(order);
        payment.print();
        System.out.println(payment.getFullPrice());
        for (int i = 0; i < 5; i++) {
            payment.addOrder(i+2, r.nextInt(101));
        }
        //print payment (all orders)
        payment.print();
        //print full price
        System.out.println(payment.getFullPrice());
        //delete order
        payment.deleteOrder(4);
        //print payment (all orders)
        payment.print();
        //print full price
        System.out.println(payment.getFullPrice());
    }

    //class calendar with inner class, holidays can be used
    void func3(){
        //init calendar
        Calendar calendar = new Calendar();
        //add holidays
        for (int i = 1; i < 11; i++) {
            Calendar.Data data = calendar.new Data(2020, i, i*3);
            data.setHoliday(true);
            calendar.addHoliday(data);
        }
        //print data
        calendar.printDay(2020, 2, 6);
        calendar.printDay(2020, 4, 29);
    }

    //dragon with 100 treasures, print all, max, on sum
    void func4(){
        //init dragon
        Dragon dragon = new Dragon();
        dragon.loadTreasure();
        dragon.sortByPrice();
        //console menu
        boolean exit = false;
        Scanner scanner = new Scanner(System.in);
        while (!exit){
            System.out.println("print '0' to exit");
            System.out.println("print '1' to printAll");
            System.out.println("print '2' to printMax");
            System.out.println("print '3' to printBySum");
            int k = scanner.nextInt();
            switch (k){
                case 0:
                    //exit
                    exit = true;
                    System.out.println("bye-bye");
                    break;
                case 1:
                    //print all
                    dragon.printAll();
                    break;
                case 2:
                    //print max price
                    dragon.printExpensive();
                    break;
                case 3:
                    //print on sum
                    System.out.println("print sum");
                    k = scanner.nextInt();
                    dragon.printBySum(k);
                    break;
                default:
                    scanner.next();
            }
        }
        scanner.close();
    }

    //bouquet of flowers
    void func5(){
        //init bouquet
        Bouquet bouquet = new Bouquet();
        addFlowers(bouquet, 3, 2, 2);
        bouquet.setWrapper("gold", true);
        //print info
        bouquet.printInfo();
    }

    //add flowers
    void addFlowers(Bouquet bouquet, int i1, int i2, int i3){
        addRose(bouquet, i1);
        addLily(bouquet, i2);
        addLotus(bouquet, i3);
    }

    //add rose
    void addRose(Bouquet bouquet, int i1){
        for (int i = 0; i < i1; i++) {
            bouquet.addFlower(new Rose());
        }
    }

    //add lily
    void addLily(Bouquet bouquet, int i1){
        for (int i = 0; i < i1; i++) {
            bouquet.addFlower(new Lily());
        }
    }

    //add lotus
    void addLotus(Bouquet bouquet, int i1){
        for (int i = 0; i < i1; i++) {
            bouquet.addFlower(new Lotus());
        }
    }

}
