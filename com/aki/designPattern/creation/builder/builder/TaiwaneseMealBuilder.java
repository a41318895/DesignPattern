package com.aki.designPattern.creation.builder.builder;

import com.aki.designPattern.creation.builder.Entity.Meal;

public class TaiwaneseMealBuilder implements MealBuilder {

    Meal meal ;

    public TaiwaneseMealBuilder() {
        this.meal = new Meal();
    }

    @Override
    public void buildStarter() {
        meal.setStarter("Taiwanese Starter");
    }

    @Override
    public void buildMainCourse() {
        meal.setMainCourse("Taiwanese Main Course");
    }

    @Override
    public void buildDessert() {
        meal.setDessert("Taiwanese Dessert");
    }

    @Override
    public Meal getMeal() {
        return meal;
    }
}
