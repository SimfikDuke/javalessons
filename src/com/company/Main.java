package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Go?");
        //System.console().readLine();
        FirstGUI animalGUI = new FirstGUI();
        animalGUI.setVisible(true);
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Animal[] animals = new Animal[]{
                new Bear("Gosha", "brown", 125,12),
                new Cat("Garfield", "siberian", 15)
        };
        for(int i = 0; i < animals.length; i++){
            System.out.println(animals[i].info());
        }
    }
}
