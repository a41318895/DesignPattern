package com.aki.designPattern.behavioral.strategy.impl;

import com.aki.designPattern.behavioral.strategy.behavior.Strategy;

public class InsertionSort implements Strategy {

    @Override
    public void sort(int[] numbers) {

        System.out.println("Insertion Sorting Executing...") ;

        for(int currentIndex = 1 ; currentIndex < numbers.length ; currentIndex ++) {

            int elementToInsert = numbers[currentIndex] ;
            int comparedIndex = currentIndex - 1 ;  // compare from right to left

            while(comparedIndex >= 0 && numbers[comparedIndex] > elementToInsert) {

                numbers[comparedIndex + 1] = numbers[comparedIndex] ;    // move value one step to right
                comparedIndex -- ;  // move index one step to left
            }

            numbers[comparedIndex + 1] = elementToInsert ;
        }
    }
}
