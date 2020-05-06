import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);

        int counter = 0, sum = 0;



        while (true){
            boolean isInt = scanner.hasNextInt();

            if(isInt) {
                int number = scanner.nextInt();
                sum += number;
                counter++;
                scanner.nextLine();
            } else break;
        }
        long avg = Math.round(sum / (double) counter);
        System.out.println("SUM = " + sum + " AVG = " + avg);
    }
}
