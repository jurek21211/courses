public class NumberPalindrome {
    public static boolean isPalindrome (int number) {
        if (number < 0)
            number = -number;
        
        int reversedNumber = 0;
        int originalNumber = number;

        while (number > 0) {
            int lastDigit = number % 10;
            reversedNumber *= 10;
            reversedNumber += lastDigit;
            number /= 10;
        }

        return reversedNumber == originalNumber;
    }
}
