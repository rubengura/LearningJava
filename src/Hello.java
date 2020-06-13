public class Hello {
    public static void main(String[] args){
        System.out.println("Hello World!");

        int x = 3;
        System.out.println(x);
        int y = x * 2;
        System.out.println(y);
        System.out.println(x);

        boolean condition = false;
        if (condition)
            System.out.println("Condition is true");
            System.out.println("I do not belong to the if statement");
        if (!condition){
            System.out.println("Condition is true");
            System.out.println("I'm inside the if statement yet");
        }

        // Ternary operations
        int clientAge = 20;
        //                       condition   yes return | no return
        boolean isOverEighteen = clientAge >= 18 ? true : false;

        if (isOverEighteen)
            System.out.println("The client has more than 18 years");

        boolean gameOver = false;
        int score = 1000;
        int level = 5;
        int bonus = 100;

        int finalScore;
        if (gameOver) {
            finalScore = score + (level * bonus);
            System.out.println("Final score: " + finalScore);
        } else {
            finalScore = score;
        }

        System.out.println("Your final score: " + finalScore);

    }
}
