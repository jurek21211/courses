package com.company;

public class Main {

    public static void main(String[] args) {
        for (int i = 2; i <= 8; i++) {
            System.out.println(String.format("%.2f", calculateInterest(10000.0, i)));
        }
        System.out.println("************************");
        for (int i = 8; i >= 2; i--) {
            System.out.println(String.format("%.2f", calculateInterest(10000.0, i)));
        }

        System.out.println(isPrime(13));

        System.out.println("*****||||*****");

        int count = 0;

        for (int i = 10; i < 50; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println(i + " is prime number.");
            }
            if (count == 3)
                break;
        }

        System.out.println("Sum 3 and 5 Challenge");
        int sum = 0;
        count = 0;

        for (int i = 1; i <= 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                sum += i;
                count++;
                System.out.println("Found number is " + i);
            }
            if (count == 5) {
                System.out.println("Sum of found numbers is " + sum);
                break;
            }
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

    public static boolean isPrime(int n) {
        if (n == 1)
            return false;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
