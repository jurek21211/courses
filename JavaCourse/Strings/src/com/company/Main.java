package com.company;

public class Main {

    public static void main(String[] args) {

        String myString = "This is string";
        System.out.println(myString);
        myString = myString + ", and this is more.";
        System.out.println(myString);
        myString = myString + "\u00A9 2019";
        System.out.println(myString);
        String numberString = "255.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);
    }
}
