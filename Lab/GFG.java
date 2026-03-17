package Lab;

import java.util.*;

public class GFG {
    public static void main(String[] args) {
        ArrayList<String> s = new ArrayList<>();

        s.add("Cherry");
        s.add("Blueberry");
        s.add("Strawberry");

        // Consumer<String> con = t -> System.out.println(t);

        s.forEach(t -> System.out.println(t));

        System.out.println();

        ArrayList<Integer> n = new ArrayList<>();
        n.add(2);
        n.add(3);
        n.add(4);

        n.forEach(num -> System.out.println(num * num));

        System.out.println();

        ArrayList<Integer> a = new ArrayList<>();
        a.add(24);
        a.add(18);
        a.add(12);

        a.forEach(
                age -> {
                    if (age >= 18) {
                        System.out.println("Eligible age: " + age);
                    }

                });
    }
}
