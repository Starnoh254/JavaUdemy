package Lab;

import java.util.*;
import java.util.function.Supplier;

class Printer {
    void print(String msg){
        System.out.println(msg);
    }
}

class Student {
    Student(){
        System.out.println("Student object created");
    }
}

public class RefDemo {

    public static void print(String s){
        System.out.println(s);
    }

    public static void main(String[] args) {

        Printer printer = new Printer();
        String[] names = {"Geek1" , "Geek2" , "Geek3"};

        //using method reference to print each name
        Arrays.stream(names).forEach(RefDemo::print);

        System.out.println();



        List<String> data = Arrays.asList("Java" , "Spring" , "Boot");
        data.forEach(printer::print);

        System.out.println();

        data.stream()
            .map(String::toUpperCase)
            .forEach(System.out::println);


        Supplier<Student> supplier = Student::new;

        supplier.get();

    }
}
