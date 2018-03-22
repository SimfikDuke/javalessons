package com.company;

public class Bear extends Animal{
    public int age = 1;
    public String color = "white";
    public Bear(String name, String color, int weight, int age){
        super(name, weight);
        this.age = age;
        this.color = color;
    }

    @Override
    public String info() {
        return super.info() + "My color is " + color + ". I'm " + age + " years old. ";
    }
}
