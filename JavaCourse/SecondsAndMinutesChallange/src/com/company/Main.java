package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getDurationString(75, 5));
        System.out.println(getDurationString(3945));
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59)
            return "Invalid parameters";

        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        String hoursString, minutesString, secondsString;

        hoursString = hours < 10 ? "0" + hours : hours + "";
        minutesString = remainingMinutes < 10 ? "0" + remainingMinutes : remainingMinutes + "";
        secondsString = seconds < 10 ? "0" + seconds : seconds + "";

        return hoursString + "h " + minutesString + "m " + secondsString + "s";
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0)
            return "Invalid parameters";

        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;

        return getDurationString(minutes, remainingSeconds);
    }
}
