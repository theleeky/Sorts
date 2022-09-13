package com.sparta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SortTests{

    @Test
    @DisplayName("Check if BubbleSort sorts")
    void bubbleSort() {
        BubbleSort bubbleSort = new BubbleSort();
        int[] array = {5,9,2};
        int[] expected = {2,5,9};
        int[] sortedArray = bubbleSort.sortArray(array);
        Assertions.assertArrayEquals(expected, sortedArray);
    }

    @Test
    @DisplayName("Test if sorted array are merged and sorted")
    void mergeArray(){
        MergeSort merge = new MergeSort();
        int[] a = {1,3,5};
        int[] b = {2,4,6,8};
        int[] expected = {1,2,3,4,5,6,8};
        Assertions.assertArrayEquals(expected, merge.merge(a,b));
    }

    @Test
    @DisplayName("Test if MerseSort sorts")
    void mergeSort(){
        MergeSort mergeSort = new MergeSort();
        int[] a = {8,4,1};
        int[] expected = {1,4,8};
        Assertions.assertArrayEquals(expected, mergeSort.sortArray(a));
    }

    @Test
    @DisplayName("Test if duplicates are removed")
    void removeDuplicates(){
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        int[] array = {1,2,3,3,4,5,5};
        int[] expected = {1,2,3,4,5};
        Assertions.assertArrayEquals(expected,removeDuplicates.removeDuplicates(array));
    }

    @Test
    @DisplayName("Test if BinaryTree sorts")
    void binarySort(){
        BinaryTree binaryTree = new BinaryTree();
        int[] array = {4,2,9,1};
        int[] expected = {1,2,4,9};
        Assertions.assertArrayEquals(expected, binaryTree.sortArray(array));
    }

    @Test
    @DisplayName("Test if Binary tree removes duplicates")
    void binarySortDuplicates(){
        BinaryTree binaryTree = new BinaryTree();
        int[] array = {1,2,2};
        int[] expected = {1,2};
        Assertions.assertArrayEquals(expected, binaryTree.sortArray(array));
    }


}