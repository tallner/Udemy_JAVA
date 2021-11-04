package com.cte;

public class Vehicle {
    private String name;
    private String size;
    private int direction;
    private int speed;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;
        this.direction = 0;
        this.speed = 0;
    }

    public void steer(int direction) {
        this.direction =+ direction;
        System.out.println("Current direction is " + this.direction);
    }

    public void move(int speed) {
        this.speed = speed;
        System.out.println("Current speed is " + this.speed);
    }

    public void stop(){
        this.speed = 0;
        System.out.println("Current speed is "+this.speed);
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getDirection() {
        return direction;
    }

    public int getSpeed() {
        return speed;
    }
}
