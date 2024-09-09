package com.aki.designPattern.creation.builder.Entity;

public class Meal {

    private String starter ;
    private String mainCourse ;
    private String dessert ;

    public void setStarter(String starter) {
        this.starter = starter;
    }

    public String getStarter() {
        return starter;
    }

    public void setMainCourse(String mainCourse) {
        this.mainCourse = mainCourse;
    }

    public String getMainCourse() {
        return mainCourse;
    }

    public void setDessert(String dessert) {
        this.dessert = dessert;
    }

    public String getDessert() {
        return dessert;
    }

    @Override
    public String toString() {

        return String.format("[ Starter: %s ], [ Main Course: %s ], [ Dessert: %s ]", starter, mainCourse, dessert);
    }
}
