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

    }
}
