package Lessons2;

import java.util.*;

public class IteratorExample {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();
        cars.add("BMW");
        cars.add("MERCEDES BENZ");
        cars.add("AUDI");
        cars.add("PORSCHE");

        Iterator<String> it = cars.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
