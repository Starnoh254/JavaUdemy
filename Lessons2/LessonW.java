package Lessons2;

import java.util.*;

public class LessonW {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Pinapple");
        fruits.add("Guava");

        System.out.println(fruits.contains("Banana"));
        fruits.remove("Banana");
        System.out.println(fruits);

        // using enhanced for loop to iterate over the set 

        for(String fruit : fruits){
            System.out.print(fruit + " ");
        }
    }
}
