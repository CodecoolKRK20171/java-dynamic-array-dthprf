package com.codecool.dynamicArrayDojo;

import java.util.Arrays;

public class DynamicIntArray {
    private static final int INITIAL_CAPACITY = 10;
    private int size = 0;
    private int[] array = {};

    public DynamicIntArray() {
        this.array = new int[INITIAL_CAPACITY];
    }

    public DynamicIntArray(int length) {
        this.array = new int[length];

    }

    public void add(int element) {
        if (size == array.length) {
            enlargeCapacity();
        }
        this.array[size] = element;
        this.size++;
    }

    private void enlargeCapacity() {
        int newIncreasedCapacity = array.length * 2;
        array = Arrays.copyOf(array, newIncreasedCapacity);
    }

    public void remove(int index) {
        if (index > size || index < 0) {
            throw new ArrayIndexOutOfBoundsException();

        } else {

            int[] arrayAfter = new int[this.size - 1];

            int j = 0;

            for (int i = 0; i < size; i++) {
                if (i == index) {
                    i++;
                }

                if (i == size) {
                    break;
                }

                arrayAfter[j] = array[i];
                j++;
            }

            this.array = arrayAfter;
            size --;
            }
        }

    public void insert(int index, int element) {
        if (size == array.length) {
            enlargeCapacity();
        }

        if (index > size) {
            index = size;
        }

        int[] result = new int[size + 1];
        System.arraycopy(array, 0, result, 0, index);
        System.arraycopy(array, index, result, index + 1, size - index);
        result[index] = element;
        this.array = result;
        size++;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(" ");
            sb.append(array[i]);
        }

        return sb.toString();
    }

    public int length() {
        return this.size;
    }
}
