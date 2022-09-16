package com.sparta.controller;

import com.sparta.model.RemoveDuplicates;
import com.sparta.model.BinaryTree;
import com.sparta.model.BubbleSort;
import com.sparta.model.MergeSort;
import com.sparta.model.Sorter;

import java.util.Arrays;
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





        switch (whichSort) {
            case 1 -> {
                // Bubble Sort
                long startTime = System.nanoTime();
                sortedArray = removeDuplicates.removeDuplicates(bubbleSort.sortArray(arrayToSort));
                System.out.println("\nYou have chosen the Bubble Sort.");
                long endTime = System.nanoTime();
                long duration = (endTime - startTime);
                System.out.println("It has taken " + duration/1000000 + "ms to sort.\nSorted array:");
            }
            case 2 -> {
                // Merge Sort
                long startTime = System.nanoTime();
                sortedArray = removeDuplicates.removeDuplicates(mergeSort.sortArray(arrayToSort));
                System.out.println("\nYou have chosen the Merge Sort.");
                long endTime = System.nanoTime();
                long duration = (endTime - startTime);
                System.out.println("It has taken " + duration/1000000 + "ms to sort.\nSorted array:");
            }
            case 3 -> {
                // Binary Sort
                long startTime = System.nanoTime();
                sortedArray = binarySort.sortArray(arrayToSort);
                System.out.println("\nYou have chose the Binary Sort.");
                long endTime = System.nanoTime();
                long duration = (endTime - startTime);
                System.out.println("It has taken " + duration/1000000 + "ms to sort.\nSorted array:");
            }
            case 4 -> {
                int[] unsortedBubble = Arrays.copyOf(arrayToSort, arrayToSort.length);
                int[] unsortedMerge = Arrays.copyOf(arrayToSort, arrayToSort.length);
                int[] unsortedBinary = Arrays.copyOf(arrayToSort, arrayToSort.length);

                // All sorts comparison
                long startBubble = System.nanoTime();
                int[] bubbleArray = removeDuplicates.removeDuplicates(bubbleSort.sortArray(unsortedBubble));
                long endBubble = System.nanoTime();
                long bubbleDuration = (endBubble - startBubble);

                long startMerge = System.nanoTime();
                int[] mergeArray = removeDuplicates.removeDuplicates(mergeSort.sortArray(unsortedMerge));
                long endMerge = System.nanoTime();
                long mergeDuration = (endMerge - startMerge);

                long startBinary = System.nanoTime();
                int[] binaryArray = binarySort.sortArray(unsortedBinary);
                long endBinary = System.nanoTime();
                long binaryDuration = (endBinary - startBinary);

                System.out.println("Bubble time: " + bubbleDuration/1000000 + "ms");
                System.out.println("Merge time: " + mergeDuration/1000000 + "ms");
                System.out.println("Binary time: " + binaryDuration/1000000 + "ms\nSorted Array:");

                sortedArray = mergeArray;
            }

        }

        return sortedArray;
    }
    public int[] arrayGenerator(int whichArray){
        return IntStream.generate(() -> new Random().nextInt(5000)).limit(whichArray).toArray();
    }
}
