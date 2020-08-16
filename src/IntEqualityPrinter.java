public class IntEqualityPrinter {
    public static void printEqual(int firstParam, int secondParam, int thirdParam) {
        if (firstParam < 0 || secondParam < 0 || thirdParam < 0) {
            System.out.println("Invalid Value");
        } else if (firstParam == secondParam && firstParam == thirdParam) {
            System.out.println("All numbers are equal");
        } else if (firstParam != secondParam && firstParam != thirdParam && secondParam != thirdParam) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}
