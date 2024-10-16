package com.aki.designPattern.behavioral.strategy.impl;

import com.aki.designPattern.behavioral.strategy.behavior.Strategy;

public class BubbleSort implements Strategy {

    @Override
    public void sort(int[] numbers) {

        System.out.println("Bubble Sorting Executing...") ;

        for (int i = 0 ; i < numbers.length - 1 ; i ++) {

            for(int j = 0 ; j < numbers.length - 1 - i ; j ++) {

                if(numbers[j] > numbers[j + 1]) swap(numbers, j, j + 1) ;
            }
        }
    }

    private void swap(int[] numbers, int indexA, int indexB) {

        int temp = numbers[indexA] ;
        numbers[indexA]  = numbers[indexB] ;
        numbers[indexB]  = temp ;
    }
}
