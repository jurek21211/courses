package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("How many numbers?");
        int count = scanner.nextInt();
        int[] intArray = readInt(count);
        int minimumOfIntArray = findMin(intArray);
        System.out.println("Array:\n" +
                Arrays.toString(intArray) +
                "\nMinimum of array: " + minimumOfIntArray);
    }

    private static int[] readInt(int number) {

        int[] intArray = new int[number];

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = scanner.nextInt();
        }
        return intArray;
    }

    private static int findMin(int[] array){
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++){
            if(array[i] < min)
                min = array[i];
        }
        return min;
    }
}
