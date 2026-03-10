package Lessons2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class LessonR {
    public static void main(String[] args) throws IOException{

        

        // using scanner class for input
        // Scanner scan = new Scanner(System.in);

        // System.out.println("Enter your name: ");
        // String name = scan.nextLine();

        // System.out.println("Enter your age : ");
        // int age = scan.nextInt();

        // scan.nextLine();

        // System.out.println("Enter your City : ");
        // String city = scan.nextLine();

        // System.out.println("Name: " + name + ", Age: " + age + ", City: " + city);

        // scan.close();

        // using BufferedReader for input 


        // try with resources in java
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));){


            System.out.println("Enter your name: ");
            String name = br.readLine();

            System.out.println("Enter your age: ");
            int age = Integer.parseInt(br.readLine());

            System.out.println("Enter your city: ");
            String city = br.readLine();

            System.out.println("Name: " + name + ", Age: " + age + ", City: " + city);
            

        }
        catch(IOException e){
            System.out.println("An error occured " + e.getMessage());
            e.printStackTrace();

        }
















    }
}
