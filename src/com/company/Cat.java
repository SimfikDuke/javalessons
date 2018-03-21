package com.company;

public class Cat extends Animal {
    public String breed = "mongrel";
    public Cat(String name, String breed, int weight){
        super(name,weight);
        this.breed = breed;
    }

    @Override
    public String info() {
        return super.info()+"Моя порода " + breed + ". ";
    }
}
