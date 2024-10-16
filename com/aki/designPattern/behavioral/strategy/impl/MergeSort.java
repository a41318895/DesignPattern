package com.aki.designPattern.behavioral.strategy.impl;

import com.aki.designPattern.behavioral.strategy.behavior.Strategy;

public class MergeSort implements Strategy {

    private int printMsgCounter = 0 ;

    @Override
    public void sort(int[] numbers) {

        if(printMsgCounter == 0) System.out.println("Merge Sorting Executing...") ;
        printMsgCounter ++ ;

        if(numbers == null || numbers.length <= 1) return ;

        // Distribute Space
        int midIndex = numbers.length / 2 ;
        int[] leftPart = new int[midIndex] ;
        int[] rightPart = new int[numbers.length - midIndex] ;

        // Put value in
        for(int i = 0 ; i < midIndex ; i ++) {
            leftPart[i] = numbers[i] ;
        }

        for(int j = midIndex ; j < numbers.length ; j ++) {
            rightPart[j - midIndex] = numbers[j] ;
        }

        sort(leftPart) ;        // Finish the "sort" and "merge" left part array of origin
        sort(rightPart) ;       // Finish the "sort" and "merge" right part array of origin

        sortAndMerge(numbers, leftPart, rightPart) ;
    }

    private void sortAndMerge(int[] numbers, int[] leftPart, int[] rightPart) {

        int numbersPointer = 0, leftPointer = 0, rightPointer = 0 ;

        while(leftPointer < leftPart.length && rightPointer < rightPart.length) {

            // Sorting by If-Else condition, merging by putting value into numbers array
            if(leftPart[leftPointer] < rightPart[rightPointer]) numbers[numbersPointer ++] = leftPart[leftPointer ++] ;
            else numbers[numbersPointer ++] = rightPart[rightPointer ++] ;
        }

        // Handle the element wasn't sorted and merged
        while(leftPointer < leftPart.length) numbers[numbersPointer ++] = leftPart[leftPointer ++] ;
        while(rightPointer < rightPart.length) numbers[numbersPointer ++] = rightPart[rightPointer ++] ;
    }
}
