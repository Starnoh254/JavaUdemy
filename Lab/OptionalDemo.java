package Lab;

import java.util.*;


public class OptionalDemo {
    public static void main(String[] args) {
        // String[] words = new String[10];
        // String word = words[5].toLowerCase();

        // System.out.println(word);

        // Optional<String> checkNull = Optional.ofNullable(words[5]);

        // if(checkNull.isPresent()){
        //     String word = words[5].toLowerCase();
        //     System.out.println(word);
        // }

        // else {
        //     System.out.println("Word is null");
        // }


        String[] str = new String[5];
        str[2] = "Geeks Classes are coming soon";

        Optional<String> empty = Optional.empty();
        System.out.println(empty);

        Optional<String> value = Optional.of(str[2]);
        System.out.println(value);

        System.out.println(value.get());
        // System.out.println(empty.get());

        System.out.println(value.hashCode());
        System.out.println(value.isPresent());
        

        List<String> names = Arrays.asList("Starnoh","John","Xmas","Karma");
        String name = names.stream()
            .filter(s -> s.contains("x"))
            .findFirst()
            .orElse("404 Not Found");

        System.out.println(name);
    }
}
