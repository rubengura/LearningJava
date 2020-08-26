package ControlFlowStatements;

public class SharedDigit {
    public static boolean hasSharedDigit(int num1, int num2) {
        if (num1 >= 10 && num1 <= 99 && num2 >= 10 && num2 <= 99) {
            int unit_num1 = num1 % 10;
            int tens_num1 = num1 / 10;
            int unit_num2 = num2 % 10;
            int tens_num2 = num2 / 10;

            return (unit_num1 == unit_num2 || unit_num1 == tens_num2 ||
                    tens_num1 == unit_num2 || tens_num1 == tens_num2);
        } else {
            return false;
        }
    }
}
