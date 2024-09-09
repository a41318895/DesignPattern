package com.aki.designPattern.creation.builder;

import com.aki.designPattern.creation.builder.Entity.Meal;
import com.aki.designPattern.creation.builder.builder.JapaneseMealBuilder;
import com.aki.designPattern.creation.builder.builder.MealBuilder;
import com.aki.designPattern.creation.builder.builder.TaiwaneseMealBuilder;
import com.aki.designPattern.creation.builder.director.MealBuilderDirector;

public class BuilderTest {

    public static void main(String[] args) {

        // Indicate the meal builder we want
        MealBuilder indicatedMealBuilder = new JapaneseMealBuilder() ;

        // Tell Director what meal builder we need
        MealBuilderDirector director = new MealBuilderDirector(indicatedMealBuilder);

        // Make (Set) the starter, main course, dessert of the meal
        director.constructMeal();

        // Get the whole meal which finished
        Meal japaneseMeal = director.getMeal();
        System.out.println(japaneseMeal);


        MealBuilder indicatedMealBuilder2 = new TaiwaneseMealBuilder() ;

        director = new MealBuilderDirector(indicatedMealBuilder2) ;

        director.constructMeal();

        Meal taiwaneseMeal = director.getMeal();
        System.out.println(taiwaneseMeal);
    }
}
