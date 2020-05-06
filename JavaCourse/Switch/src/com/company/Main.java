package com.company;

public class Main {

    public static void main(String[] args) {

       /* int switchValue = 1;
        switch(switchValue){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value 2");
                break;
            default:
                System.out.println("Not 1 or 2");
                break;
        }*/

        char switchChar = 'A';
        switch (switchChar) {
            case 'A':
            case 'B':
            case 'C':
            case 'D':
                System.out.println("Value was " + switchChar);
                break;
            default:
                System.out.println("Another Letter");
                break;
        }
    }
    
}
