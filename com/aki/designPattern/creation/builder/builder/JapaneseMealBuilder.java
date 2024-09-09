package com.aki.designPattern.creation.builder.builder;

import com.aki.designPattern.creation.builder.Entity.Meal;

public class JapaneseMealBuilder implements MealBuilder {

    Meal meal ;

    public JapaneseMealBuilder() {
        meal = new Meal();
    }

    @Override
    public void buildStarter() {
        meal.setStarter("Japanese Starter");
    }

    @Override
    public void buildMainCourse() {
        meal.setMainCourse("Japanese Main Course");
    }

    @Override
    public void buildDessert() {
        meal.setDessert("Japanese Dessert");
    }

    @Override
    public Meal getMeal() {
        return meal ;
    }
}
