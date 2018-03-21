package com.company;

public class Animal {
    public int weight = 10;
    public String name = "Default";
    public Animal(String name, int weight){
        this.weight = weight;
        this.name = name;
    }
    public Animal(){}
    public String info(){
        String result = "";
        if(this.name.equals("Default")){
            result += "Моё имя " + this.name + ". ";
        }
        result += "Мой вес " + this.weight + " кг. ";
        return result;
    }
}
