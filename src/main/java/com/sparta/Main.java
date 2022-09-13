package com.sparta;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        int[] array = {0,1,2,3,4,5,6,4};
//        Sorter bubbleSort = new BubbleSort();
//        bubbleSort.sortArray(array);
//
//        System.out.println(Arrays.toString(array));

//
//        MergeSort mergeSort = new MergeSort();
//        int[] a1 = {8,5,3,21,7,1,0,2,8,4};
//
//
//        int[] test = mergeSort.sortArray(a1);
//        System.out.println(Arrays.toString(test));

        int[] array = {6,4,3,2};
        BinaryTree tree = new BinaryTree();
        int[] myTree = tree.binarySort(array);
        System.out.println(Arrays.toString(myTree));


    }

}