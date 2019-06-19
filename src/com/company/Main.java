package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int[] array = {9,4,1,2,3,3,1,2,1,1,5,3,2,6,3,1,9,3,4};
        System.out.println(Arrays.toString(array));
	    arrayPartition(array, 4);
        System.out.println(Arrays.toString(array));
    }

    private static void arrayPartition(int[] array, int pivotIndex) {
        int pivot = array[pivotIndex];
        int smallerIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < pivot) {
                swap(array, i, smallerIndex++);
            }
        }

        int larger = array.length - 1;
        for (int i = array.length -1; i >= 0 && array[i] >= pivot; i--) {
            if (array[i] > pivot) {
                swap(array, larger--, i);
            }
        }
    }

    private static void swap(int[] array, int i, int j) {
        if (i == j)
            return;

        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}