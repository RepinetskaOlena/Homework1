package com.company;

import java.util.Arrays;

public class Array implements Sortable{
    Integer [] arr;

    public Array (int size) {
      arr = new Integer[size];
        for (int i = 0; i < size; i++) {
        arr [i] = (int) (Math.random() * size);
                }
    }
        Arrays.sort(arr) -> Integer.signum(a.length() - b.length()));


personList.sort((p1, p2) -> p1.firstName.compareTo(p2.firstName));

}
