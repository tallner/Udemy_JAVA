package com.cte;

import javax.swing.*;

public  class Main {
    public static void main(String[] args) {
//        Animal animal = new Animal("Animal", 1,1,5,5);
//
//        Dog dog = new Dog("yorkie",8,2,2,4,1,20,"fur");
//        dog.eat();
////        dog.walk();
//        dog.run();
//        Audi audi = new Audi(12);
//        audi.accelerate(23);
//        audi.changeVelocity(90,75);
//        audi.accelerate(-30);
//        audi.accelerate(-13);
//        audi.accelerate(-23);
//        audi.stop();

        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("rectangle.width= " + rectangle.getWidth());
        System.out.println("rectangle.length= " + rectangle.getLength());
        System.out.println("rectangle.area= " + rectangle.getArea());
        Cuboid cuboid = new Cuboid(5,10,5);
        System.out.println("cuboid.width= " + cuboid.getWidth());
        System.out.println("cuboid.length= " + cuboid.getLength());
        System.out.println("cuboid.area= " + cuboid.getArea());
        System.out.println("cuboid.height= " + cuboid.getHeight());
        System.out.println("cuboid.volume= " + cuboid.getVolume());
    }
}
