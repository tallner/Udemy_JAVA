package com.cte;

public class Dog extends Animal{
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight); //call the constructor from the class we extended from
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew(){
        System.out.println("Dog.chew called");
    }

    //override a method in the superclass eg Animal
    @Override
    public void eat() {
        System.out.println("Dog.eat called");
        chew();
        super.eat(); //call super
    }

    public void walk(){
        System.out.println("dog.walk");
        move(5);
    }
    public void run(){
        System.out.println("dog.run");
        move(10);
    }

    private void moveLegs(int speed){
        System.out.println("Dog movelegs called");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move called");
        moveLegs(speed);
        super.move(speed);
    }
}
