package com.cte;

public class Audi extends Car{
    private String color;
    private int roadServiceMonths;

    public Audi(int roadServiceMonths) {
        super("Audi", "Station", 4, 5, 6, false);
        this.color = "Green";
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate(int rate){
        int newSpeed = getSpeed() + rate;
        if (newSpeed==0) {
            stop();
            changeCurrentGear(0);
        }
        else if (newSpeed > 0 && newSpeed<10) changeCurrentGear(1);
        else if (newSpeed > 10 && newSpeed<20) changeCurrentGear(2);
        else if (newSpeed > 20 && newSpeed<30) changeCurrentGear(3);
        else if (newSpeed > 30 && newSpeed<40) changeCurrentGear(4);
        else changeCurrentGear(5);

        if (newSpeed>0) changeVelocity(newSpeed,getDirection());
    }

}
