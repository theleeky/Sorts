package com.sparta;

class BubbleSort implements Sorter{
    public int[] sortArray(int[] arrayToSort){
        int n = arrayToSort.length;

        //Traverse through all array elements
        for (int i = 0; i < n; i++){
            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++){
                if (arrayToSort[j] > arrayToSort[j+1]) {
                    swap(j, j + 1, arrayToSort);
                    swapped = true;
                }
            }
            if (swapped == false){
                break;
            }
        }
        return arrayToSort;
    }
    public static void swap(int i, int j, int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

}
