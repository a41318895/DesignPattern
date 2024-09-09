package com.aki.designPattern.creation.builder.director;

import com.aki.designPattern.creation.builder.Entity.Meal;
import com.aki.designPattern.creation.builder.builder.MealBuilder;

public class MealBuilderDirector {

    private final MealBuilder mealBuilder;

    public MealBuilderDirector(MealBuilder mealBuilder) {
        this.mealBuilder = mealBuilder ;
    }

    public void constructMeal() {
        mealBuilder.buildStarter();
        mealBuilder.buildMainCourse();
        mealBuilder.buildDessert();
    }

    public Meal getMeal() {
        return mealBuilder.getMeal() ;
    }
}
