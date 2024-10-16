package com.aki.designPattern.behavioral.strategy;

import com.aki.designPattern.behavioral.strategy.impl.*;

public class StrategyTest {

    public static void main(String[] args) {

        Context contextWithBubbleSorting = new Context(new BubbleSort()) ;
        contextWithBubbleSorting.doStrategy(new int[] {6, 4, 3, 7, 1, 5, 2}) ;

        Context contextWithSelectionSorting = new Context(new SelectionSort()) ;
        contextWithSelectionSorting.doStrategy(new int[] {6, 4, 3, 7, 1, 5, 2}) ;

        Context contextWithInsertionSorting = new Context(new InsertionSort()) ;
        contextWithInsertionSorting.doStrategy(new int[] {6, 4, 3, 7, 1, 5, 2}) ;

        Context contextWithQuickSorting = new Context(new QuickSort()) ;
        contextWithQuickSorting.doStrategy(new int[] {6, 4, 3, 7, 1, 5, 2}) ;

        Context contextWithMergeSorting = new Context(new MergeSort()) ;
        contextWithMergeSorting.doStrategy(new int[] {6, 4, 3, 7, 1, 5, 2}) ;
    }
}
