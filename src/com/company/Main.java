package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Go?");
        //System.console().readLine();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Animal garfield = new Animal("Garfield", 15);
        System.out.println(garfield.info());
        Cat sharik = new Cat("Sharik", "siberian", 7);
        System.out.println(sharik.info());
    }
}
