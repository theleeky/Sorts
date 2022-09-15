package com.sparta.model;


import java.util.Arrays;

public class MergeSort implements Sorter {
    public int[] sortArray(int[] arrayToSort){
        return sort(arrayToSort, 0, arrayToSort.length - 1);
    }

    public int[] merge(int[] a, int[] b){

        // counter variables
        // i for a, j is for b, k is for r
        int i = 0, j = 0, k = 0;
        int m = a.length, n = b.length;
        int[] mergedArray = new int[m + n];

        // adding the smaller number to new array
        while (i < m && j < n){
            if (a[i] < b[j]){
                mergedArray[k] = a[i];
                k++;
                i++;
            } else{
                mergedArray[k] = b[j];
                k++;
                j++;
            }
        }
        // adding rest of array to new array
        while (i < m){
            mergedArray[k] = a[i];
            k++;
            i++;
        }
        while (j < n){
            mergedArray[k] = b[j];
            k++;
            j++;
        }
        return mergedArray;
    }

    public int[] sort(int[] arr, int left, int right){

        if (left < right) {
            int middle = left + (right - left) / 2;


            int[] leftArray = Arrays.copyOfRange(arr, left, middle + 1);
            leftArray = sort(leftArray, 0, leftArray.length - 1);
            int[] rightArray = Arrays.copyOfRange(arr, middle + 1, right + 1);
            rightArray = sort(rightArray, 0, rightArray.length - 1);

            arr = merge(leftArray, rightArray);
        }
        return arr;
        }

    }

