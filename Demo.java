import java.util.ArrayList;
import java.util.List;

class Human {
    private int age;
    private String name ;

    public Human(String name) {
        this.name = name;
        this.age = 100;
    }


    // Parameterized Constructor
    public Human(String name , int age){
        System.out.println("in constructor");
        this.setAge(age);
        this.setName(name);

    }


    // Default Constructor
    public Human(){
        this.setAge(18);
        this.setName("John Doe");
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

}


public class Demo {

    public static void main (String args[]) {

        // Human obj = new Human("Ogwambo",25);
        // Human obj = new Human("IshowSpeed");
        // // obj.age = 11;
        // // obj.name = "Navin";

        // System.out.println("Name : " + obj.getName() + " age : " + obj.getAge());

        // obj.setName("Starnoh John");
        // obj.setAge(23);

        // System.out.println("Name : " + obj.getName() + " age : " + obj.getAge());

        // int result = factorial(5);
        // System.out.println(result);

        // List<Integer> and int[] nums in java 

        int[] nums = {1,2,3};
        nums[0] = 10;


        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);

    }

    public static int factorial(int num) {
        if(num == 0 || num == 1) {
            return 1;
        }

        return num * factorial(num - 1);
    }
}
