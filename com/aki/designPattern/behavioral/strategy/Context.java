package com.aki.designPattern.behavioral.strategy;

import com.aki.designPattern.behavioral.strategy.behavior.Strategy;

import java.util.Arrays;

// To receive strategies
public class Context {

    private final Strategy strategy ;

    public Context(Strategy strategy) {
        this.strategy = strategy ;
    }

    public void doStrategy(int[] numbers) {

        strategy.sort(numbers) ;

        System.out.println(Arrays.toString(numbers));
    }
}
