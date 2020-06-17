public class TeenNumberChecker {
    public static boolean hasTeen(int num1, int num2, int num3) {
        int[] listNums = {num1, num2, num3};

        for (int num : listNums) {
            if (isTeen(num))
                return true;
            }
        return false;
    }

    public static boolean isTeen(int num) {
        return num >= 13 && num <= 19;
    }
}
