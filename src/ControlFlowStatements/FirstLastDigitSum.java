package ControlFlowStatements;

public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        } else {
            int lastDigit = number % 10;
            int firstDigit;
            while (true) {
                if (number / 10 == 0) {
                    firstDigit = number;
                    break;
                } else {
                    number = number / 10;
                }
            }
            return firstDigit + lastDigit;
        }
    }
}
