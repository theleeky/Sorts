# Sorts

This project is to demonstrate and practice some sorting algorithms, utilising
newly learnt Java syntax, interfaces and Jupiter testing.
---
### Bubble Sort
The first sorting algorithm I look at is the Bubble Sort Algorithm. 
The bubble sort algorithm works by continuously transversing through 
an unsorted array, swapping values if the larger value is on the left.

```java
for (int i = 0; i < n; i++){
            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++){
                if (arrayToSort[j] > arrayToSort[j+1]) {
                    swap(j, j + 1, arrayToSort);
                    swapped = true;
                }
            }
```
This is snippet of how the bubble sort algorithm was implemented in Java. Take
note of the variable `boolean swapped` as this optimised the algorithm, checking 
if values are swapped or not. If no values are swapped the loop stops, effectively
returning the result quicker. \
\
I've also tested this implementation using Jupiter.

```java
 @Test
    @DisplayName("Check if BubbleSort sorts")
    void bubbleSort() {
        BubbleSort bubbleSort = new BubbleSort();
        int[] array = {5,9,2};
        int[] expected = {2,5,9};
        int[] sortedArray = bubbleSort.sortArray(array);
        Assertions.assertArrayEquals(expected, sortedArray);
    }
```
---
### Merge Sort
The next sorting algorithm I looked at was the merge sort. This works 
by utilising recursion, where the array is broken up into single elemeent arrays,
then continuously merging them with a algorithm that merges sorted arrays.

```java
 if (left < right) {
            int middle = left + (right - left) / 2;


            int[] leftArray = Arrays.copyOfRange(arr, left, middle + 1);
            leftArray = sort(leftArray, 0, leftArray.length - 1);
            int[] rightArray = Arrays.copyOfRange(arr, middle + 1, right + 1);
            rightArray = sort(rightArray, 0, rightArray.length - 1);

            arr = merge(leftArray, rightArray);
```
This is a snippet of the code that I've used to implement the merge sort 
algorithm. As seen above, recursively, the original array is continuously
split into 2 and then merged into a sorted array.\
\
I've also tested this implementation using Jupiter.
```java
   @Test
    @DisplayName("Test if MerseSort sorts")
    void mergeSort(){
        MergeSort mergeSort = new MergeSort();
        int[] a = {8,4,1};
        int[] expected = {1,4,8};
        Assertions.assertArrayEquals(expected, mergeSort.sortArray(a));
    }
```
---
### Binary Sort
The last sorting algorithm is the implementation of a Binary Tree. This
works by creating a new binary tree data structure. The binary tree 
is very useful for searching for items as it greatly minimises the number
of comparisons it takes to find a value.

```java

```

---
### Comparison

