import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] testArray = getIntegers(5);
        printArray(testArray);
        sortArray(testArray);
        System.out.println("******* SORTED **********");
        printArray(testArray);
    }

    public static int[] getIntegers(int number) {
        int[] array = new int[number];

        for (int i = 0; i < array.length; i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void sortArray(int[] array){
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++){
                if (array[i] > array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++){
            System.out.println("Element #" + i + " value: " + array[i]);
        }
    }
}
