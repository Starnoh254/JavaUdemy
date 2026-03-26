package Lab;

public class StaticBlockExample {
    // static variable
    static int value;

    // First static block
    static {
        System.out.println("First static block executed");
        value = 10;
    }

    // Second static block 
    static {
        System.out.println("Second static block executed");
        value = value * value;
    }


    public static void main(String[] args){
        System.out.println("Main method executed");
        System.out.println("Final Value: " + value);



    }
}
