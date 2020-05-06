package com.company;

public class Main {

    public static void main(String[] args) {

        float minFloat = Float.MIN_VALUE;
        float maxFloat = Float.MAX_VALUE;

        System.out.println("Float min = " + minFloat);
        System.out.println("Float max = " + maxFloat);

        double minDouble = Double.MIN_VALUE;
        double maxDouble= Double.MAX_VALUE;

        System.out.println("Double min = " + minDouble);
        System.out.println("Double max = " + maxDouble);

        int intValue = 5 / 3;
        float floatValue = 5f / 3f;
        double doubleValue = 5.00 / 3.00;
        System.out.println("int: " + intValue);
        System.out.println("float: " + floatValue);
        System.out.println("double: " + doubleValue);


        double pounds = 200;
        double kilograms = pounds * 0.45359237;
        System.out.println(pounds + "pounds = " + kilograms + " kilograms");

    }
}
