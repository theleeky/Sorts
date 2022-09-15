package com.sparta.model;

import java.util.Arrays;

public class RemoveDuplicates {
    public int[] removeDuplicates(int[] array)
    {
        return Arrays.stream(array).distinct().toArray();
    }
}
