package com.aki.designPattern.behavioral.strategy.impl;

import com.aki.designPattern.behavioral.strategy.behavior.Strategy;

public class SelectionSort implements Strategy {

    @Override
    public void sort(int[] numbers) {

        System.out.println("Selection Sorting Executing...") ;

        for(int lastUnsortedIndex = 0 ; lastUnsortedIndex < numbers.length - 1 ; lastUnsortedIndex ++) {

            int minIndex = lastUnsortedIndex ;

            for(int j = lastUnsortedIndex + 1 ; j < numbers.length ; j ++) {

                if(numbers[j] < numbers[minIndex]) minIndex = j ;
            }

            swap(numbers, lastUnsortedIndex, minIndex) ;
        }
    }

    private void swap(int[] numbers, int lastUnsortedIndex, int minIndex) {

        int temp = numbers[lastUnsortedIndex] ;
        numbers[lastUnsortedIndex] = numbers[minIndex] ;
        numbers[minIndex] = temp ;
    }
}
