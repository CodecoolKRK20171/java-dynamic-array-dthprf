package com.codecool.dynamicArrayDojo;

import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {
        DynamicIntArray array = new DynamicIntArray(10);
        for (int i = 0; i < 11; ++i) {
            array.add(i);
        }

        array.insert(8, 223);
        array.insert(100, 654);
        System.out.println(array);
    }
}
