package Lessons2;

import java.util.*;

public class LessonV {
    public static void main(String[] args){

        // Creating a List of Strings using ArrayList (dynamic array)
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");

        System.out.println("Programming Languages:");

        for(String lang : list){
            System.out.println(lang);
        }



        // Adding elements to object of List interface custom elements
        List<String> al = new ArrayList<>();

        al.add("Geeks");
        al.add("Geeks");
        al.add(1, "For");

        System.out.println(al);


        List<String> al2 = new ArrayList<>();
        
        al2.add("Geeks");
        al2.add("Geeks");
        al2.add(1 , "Geeks");

        System.out.println("Initial ArrayList " + al2);

        // updating element at 1st index using set() method
        System.out.println("The previous element was : " + al2.set(1, "For"));
        

        System.out.println("Updated ArrayList " + al2);


        // Searching Elements 

        List<Integer> al3 = new ArrayList<>();
        al3.add(1);
        al3.add(2);
        al3.add(3);
        al3.add(2);

        // use indexOf() to find the first occurrence of an element in the list 
        int i = al3.indexOf(2);

        System.out.println("First occurrence of 2 is at Index: " + i);

        // use lastIndexOf() to find the last occurrence of an element in the list 

        int j = al3.lastIndexOf(2);

        System.out.println("Las occurrence of 2 is at Index: " + j);

        // Removing Elements from a List 

        List<String> al4 = new ArrayList<>();

        al4.add("Geeks");
        al4.add("Geeks");

        al4.add(1 , "For");

        System.out.println("Initial ArrayList " + al4);
        al4.remove(1);

        System.out.println("After the Index Removal " + al4);

        al4.remove("Geeks");

        System.out.println("After the Object Removal " + al4);


        // Accessing Elements 

        String first = al.get(0);
        String second = al.get(1);
        String third = al.get(2);

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(al);


        // checking if an element is present using contains() method

        System.out.println();

        String checkString = "cheeks";

        boolean isPresent = al.contains(checkString);

        System.out.println("Is " + checkString + " present in the list? " + isPresent);


        // Iterating over List interface in Java 

        System.out.println();
        System.out.println("********* Iterating over List interface in java *********");

        for(int k = 0 ; k < al.size(); k++){

            // using get() method to access particular element 

            System.out.print(al.get(k) + " ");

        }

        System.out.println();

        for(String str : al){
            System.out.print(str + " ");
        }
    }
}
