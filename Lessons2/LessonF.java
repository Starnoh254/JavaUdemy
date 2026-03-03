package Lessons2;

public class LessonF {
    public static void main(String[] args){
        try{
            checkAge(13);
        } catch(IllegalArgumentException e){
            System.out.println("Caught exception: " + e.getMessage());
        }

        System.out.println("Hello there , I am still being executed");

    }

    static void checkAge(int age){

        if(age < 18){
            throw new IllegalArgumentException("Access Denied - You must be at least 18 years old");
        }

        else {
            System.out.println("Access Granted - You are old enough");
        }
    }
}