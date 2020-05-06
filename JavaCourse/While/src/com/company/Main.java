package com.company;

public class Main {

    public static void main(String[] args) {
//	int count = 0;
//	while (count != 6) {
//        System.out.println("Count: " + count);
//        count++;
//    }
//
//	count = 1;
//	while (true) {
//	    if (count == 6)
//	        break;
//        System.out.println("Count: " + count);
//        count++;
//    }

        int number = 4;
        int finishNumber = 20;

        while (number <= finishNumber) {
            number ++;
            if (!isEvenNumber(number))
                continue;

            System.out.println("Even number: " + number);
        }
    }

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
}
