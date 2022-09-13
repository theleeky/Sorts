package com.sparta;

import java.util.Arrays;

public class RemoveDuplicates {
    public int[] removeDuplicates(int[] array)
    {
        return Arrays.stream(array).distinct().toArray();
    }
}
