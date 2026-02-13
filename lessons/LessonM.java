package lessons;

public class LessonM {
    public static void main(String[] args){

        // int x;
        // if (true) {
        //     x = 10;
        // }
        // System.out.println(x);

        int x = 0;

        if (x != 0 && 10 / x > 1) {
            System.out.println("Hello");
        }

        System.out.println("Done");

        int a = 20;
        int b = 10;

        boolean result = a > b;
        boolean result2 = a > b && b > 0;

        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Is a greater than b? " + result);
        System.out.println("Is a > b and b > 0? " + result2);

    }
}
