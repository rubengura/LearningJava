package ControlFlowStatements;

public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int remainder = number;
        while (true) {
            int lastDigit = remainder % 10;
            remainder = remainder / 10;
            reverse += lastDigit;
            if (remainder == 0) {
                break;
            } else {
                reverse = reverse * 10;
            }
        }
        return (number == reverse);
    }
}
