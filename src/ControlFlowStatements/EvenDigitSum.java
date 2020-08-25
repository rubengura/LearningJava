package ControlFlowStatements;

public class EvenDigitSum {
    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        } else {
            int result = 0;
            while (number != 0) {
                int digit = number % 10;
                if (digit % 2 == 0){
                    result += digit;
                }
                number = number / 10;
            }
            return result;
        }
    }
}
