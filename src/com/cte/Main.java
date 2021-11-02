package com.cte;

import javax.swing.*;

public  class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1,1,5,5);

        Dog dog = new Dog("yorkie",8,2,2,4,1,20,"fur");
        dog.eat();
//        dog.walk();
        dog.run();
    }
}
