package com.sparta;

import java.util.HashSet;

public class RemoveDuplicates {
    public int[] removeDuplicates(int[] array)
    {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < array.length; i++){
            set.add(array[i]);
        }
        return set.stream().mapToInt(Integer::intValue).toArray();
    }
}
