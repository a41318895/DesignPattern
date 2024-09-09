package com.aki.designPattern.creation.prototype;

public class Robot implements Cloneable{

    private Long robotId ;
    private String robotName ;
    private String battery ;

    public Robot() {
        this.robotId = 1L ;
        this.robotName = "Amy Robot" ;
        this.battery = "3300 mAh" ;
    }

    public void upgrade() {
        this.robotId = 2L ;
        this.robotName = "Amy Robot Plus" ;
        this.battery = "3800 mAh" ;
    }

    @Override
    public Robot clone() {
        return new Robot() ;
    }

    @Override
    public String toString() {
        return "Robot [ robotId = " + robotId + ", robotName = " + robotName + ", battery = " + battery + " ]";
    }
}
