package com.aki.designPattern.behavioral.strategy.impl;

import com.aki.designPattern.behavioral.strategy.behavior.Strategy;

public class QuickSort implements Strategy {

    @Override
    public void sort(int[] numbers) {

        System.out.println("Quick Sorting Executing...") ;

        if(numbers == null || numbers.length == 0) {
            System.out.println("Input int array is invalid...") ;
            return ;
        }

        doQuickSort(numbers, 0, numbers.length - 1) ;
    }

    private void doQuickSort(int[] numbers, int leftBound, int rightBound) {

        int leftPointer = leftBound ;
        int rightPointer = rightBound ;

        int mid = numbers[leftPointer + (rightPointer - leftPointer) / 2] ;

        while(leftPointer < rightPointer) {

            while (numbers[leftPointer] < mid) leftPointer ++ ;
            while (numbers[rightPointer] > mid) rightPointer -- ;

            if(leftPointer <= rightPointer) {

                swap(numbers, leftPointer, rightPointer) ;

                leftPointer ++ ;
                rightPointer -- ;
            }
        }

        // Handle left part of array
        if(leftBound < rightPointer) doQuickSort(numbers, leftBound, rightPointer) ;
        // Handle right part of array
        if(rightBound > leftPointer) doQuickSort(numbers, leftPointer, rightBound) ;
    }

    private void swap(int[] numbers, int left, int right) {

        int temp = numbers[left] ;
        numbers[left] = numbers[right] ;
        numbers[right] = temp ;
    }
}
