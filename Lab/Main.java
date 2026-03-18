package Lab;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // int sum = 0;
        // for(int i = 1 ; i <= 10 ; i++){
        // sum += i;

        // }

        // System.out.println(sum);

        // Prompt the user to input a positive integer

        System.out.println("Enter your positive number : ");
        Scanner scan = new Scanner(System.in);
        int response = scan.nextInt();

        if (response < 0)
            throw new Error("Weka mawe!!!");

        for (int i = 1; i <= 10; i++) {
            int product = response * i;
            System.out.println(i + " x " + response + "= " + product);
        }

        scan.close();
    }
}






