import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 1, sum = 0, number = 0;
        while (counter <= 10) {
            System.out.println("Enter number #" + counter);
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {

                number = scanner.nextInt();
                sum += number;
                System.out.println("Number #" + counter + " = " + number);
                counter++;

            } else {
                System.out.println("Invalid Number");
            }
            scanner.nextLine();
        }
        System.out.println("Sum of 10 numbers = " + sum);
        scanner.close();
    }
}
