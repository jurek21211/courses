public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0)
            return -1;

        int lastDigit = number % 10;
        int firstNumber = 0;
        while (number >= 10){
            number /= 10;
        }
        firstNumber = number;

        return firstNumber + lastDigit;
    }
}
