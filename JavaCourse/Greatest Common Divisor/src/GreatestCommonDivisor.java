public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10)
            return -1;

        while (second != 0) {
            int reminder = first % second;
            first = second;
            second = reminder;
        }
        return first;
    }
}
