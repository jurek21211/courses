public class FlourPacker {
    public static boolean canPack (int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0)
            return false;

        int bigKilos = bigCount * 5;
        int smallKilos = smallCount;
        if(bigKilos + smallKilos < goal)
            return false;

        return goal % 5 == 0 || goal % 5 <= smallKilos;
    }
}
