public class NumberToWords {
    public static void numberToWords (int number) {
        if (number < 0 )
            System.out.println("Invalid Value");
        else {
            int notReversed = getDigitCount(number);
            int lastDigit = 0;
            String numberString = "";
            number = reverse(number);
            for (int i = 0; i < notReversed; i++) {
                lastDigit = number % 10;
                number /= 10;
                switch (lastDigit) {
                    case 0:
                        numberString += "Zero";
                        break;
                    case 1:
                        numberString += "One";
                        break;
                    case 2:
                        numberString += "Two";
                        break;
                    case 3:
                        numberString += "Three";
                        break;
                    case 4:
                        numberString += "Four";
                        break;
                    case 5:
                        numberString += "Five";
                        break;
                    case 6:
                        numberString += "Six";
                        break;
                    case 7:
                        numberString += "Seven";
                        break;
                    case 8:
                        numberString += "Eight";
                        break;
                    case 9:
                        numberString += "Nine";
                        break;
                }
                if (i != notReversed - 1)
                    numberString += " ";
            }
            System.out.println(numberString);
        }
    }


    public static int getDigitCount(int number){
        if (number < 0) return -1;

        int countOfDigits = 0;
        do {
            countOfDigits++;
            number /= 10;
        }while (number != 0);
        return countOfDigits;
    }

    public static int reverse (int number) {
        int reversedNumber = 0;
        while (number != 0) {
            reversedNumber = (reversedNumber + number % 10)  * 10;
            number /= 10;
        }

        return reversedNumber / 10;

    }
}
