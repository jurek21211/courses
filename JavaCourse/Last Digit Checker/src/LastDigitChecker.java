public class LastDigitChecker {
    public static boolean hasSameLastDigit(int a, int b, int c) {

        if(!isValid(a) || !isValid(b) || !isValid(c))
            return false;

        int aLast = a % 10, bLast = b % 10, cLast = c % 10;

        if(aLast == bLast || bLast == cLast || aLast == cLast)
            return true;

        return false;
    }

    public static boolean isValid (int number) {
        return !(number < 10 || number > 1000);
    }
}
