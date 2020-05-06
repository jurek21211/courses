public class SharedDigit {

    public static boolean hasSharedDigit(int firstNumber, int secondNumber) {

        if (firstNumber < 10 || firstNumber > 99 || secondNumber < 10 || secondNumber > 99)
            return false;

        int firstNumberLastDigit = firstNumber % 10;
        firstNumber /= 10;
        int secondNumberLastDigit = secondNumber % 10;
        secondNumber /= 10;

        if (firstNumber == secondNumber)
            return true;
        if (firstNumber == secondNumberLastDigit)
            return true;
        if (secondNumber == firstNumberLastDigit)
            return true;
        if (firstNumberLastDigit == secondNumberLastDigit)
            return true;
        return false;
    }
}
