package com.sparta;

import java.util.Random;
import java.util.stream.IntStream;

public class SortManager {
    // this class is going to be used to figure out what sort to use
    public int[] pickSort(int whichSort, int[] arrayToSort){
        Sorter bubbleSort = new BubbleSort();
        Sorter mergeSort = new MergeSort();
        Sorter binarySort = new BinaryTree();
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        int[] sortedArray = new int[arrayToSort.length];


        long startTime = System.nanoTime();

        switch (whichSort) {
            case 1 -> {
                // Bubble Sort
                sortedArray = removeDuplicates.removeDuplicates(bubbleSort.sortArray(arrayToSort));
                System.out.println("\nYou have chosen the Bubble Sort.");
            }
            case 2 -> {
                // Merge Sort
                sortedArray = removeDuplicates.removeDuplicates(mergeSort.sortArray(arrayToSort));
                System.out.println("\nYou have chosen the Merge Sort.");
            }
            case 3 -> {
                // Binary Sort
                sortedArray = binarySort.sortArray(arrayToSort);
                System.out.println("\nYou have chose the Binary Sort.");
            }
        }
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("It has taken " + duration/1000000 + "ms to sort.\nSorted array:");
        return sortedArray;
    }
    public int[] arrayGenerator(int whichArray){
        return IntStream.generate(() -> new Random().nextInt(5000)).limit(whichArray).toArray();
    }
}
