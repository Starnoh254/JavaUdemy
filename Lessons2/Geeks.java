package Lessons2;

public class Geeks {
    public static void main(String[] args){
        try {
            fun();
        } catch(NullPointerException e){
            System.out.println("Caught in main.");

        }
    }

    static void fun(){
        try {
            throw new NullPointerException("demo");

        }catch (NullPointerException e){
            System.out.println("Caught in fun");
            throw e;
        }
    }
}
