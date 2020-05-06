package com.company;

public class Main {

    public static void main(String[] args) {

        int value = 10000;

        int MinIntValue = Integer.MIN_VALUE;
        int MaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer Minimum Value = " + MinIntValue);
        System.out.println("Integer Maximum Value = " + MaxIntValue);

        System.out.println("Busted MAX value = " +  (MaxIntValue + 1));
        System.out.println("Busted MAX value = " +  (MinIntValue - 1));

        int maxValue = 2_147_483_647;

        byte minByteValue = Byte.MIN_VALUE;
        byte maxByteValue = Byte.MAX_VALUE;

        System.out.println("Minimum Byte Value = " + minByteValue);
        System.out.println("Maximum Byte Value = " + maxByteValue);

        short minShortValue = Short.MIN_VALUE;
        short maxShortValue = Short.MAX_VALUE;

        System.out.println("Minimum Short Value = " + minShortValue);
        System.out.println("Maximum Shot Value = " + maxShortValue);

        long minLongValue = Long.MIN_VALUE;
        long maxLongValue = Long.MAX_VALUE;

        System.out.println("Minimum Long Value = " + minLongValue);
        System.out.println("Maximum Shot Value = " + maxLongValue);

        long bigLongLiteral = 2_147_483_647_234L;

        int total = (MinIntValue / 2);
        byte newByteValue = (byte) (minByteValue / 2);

        short shortValue = (short) (minShortValue / 2);

        //Challange

        byte chalByteValue = 100;
        short chalShortValue = 10_000;
        int chalIntValue = 700_000;
        long chalLongValue = 50_000L + 10 * (chalByteValue + chalIntValue + chalShortValue);

        System.out.println("Challange = " + chalLongValue);

    }
}
