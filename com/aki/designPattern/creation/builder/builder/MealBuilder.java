package com.aki.designPattern.creation.builder.builder;

import com.aki.designPattern.creation.builder.Entity.Meal;

public interface MealBuilder {

    void buildStarter() ;
    void buildMainCourse() ;
    void buildDessert() ;

    Meal getMeal() ;
}
