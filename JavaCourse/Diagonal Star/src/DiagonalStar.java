public class DiagonalStar {
    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            for (int a = 1; a <= number; a++) {
                for (int b = 1; b <= number; b++) {
                    int columnCount = 1;
                    if (b == columnCount || a == number || a == columnCount || b == number || a == b || a == (number - b + 1)){
                        System.out.print("*");
                    }else {
                        System.out.print(" ");
                    }
                    columnCount++;
                }
                System.out.println();
            }
        }
    }
}
