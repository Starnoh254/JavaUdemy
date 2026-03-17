package Lessons2;

import java.util.*;
import java.util.stream.Collectors;

public class LessonY {
    public static void main(String[] args) {
        // List of lists of names 
        List<List<String>> listOfLists = Arrays.asList(
            Arrays.asList("Reflection" , "Collection","Stream"),
            Arrays.asList("Structure" , "State","Flow"),
            Arrays.asList("Sorting" , "Mapping", "Reduction","Stream")
        );

        // Create a set to hold intermediate results
        Set<String> intermediateResults = new HashSet<>();

        // Stream pipeline demonstrating various intermediate operations 
        List<String> result = listOfLists.stream()
            .flatMap(List::stream)
            .filter(s -> s.startsWith("S"))
            .map(String::toUpperCase)
            .distinct()
            .sorted()
            .peek(s -> intermediateResults.add(s))
            .collect(Collectors.toList());


        System.out.println("Intermediate Results: ");
        intermediateResults.forEach(System.out::println);

        System.out.println("Final Result: ");
        result.forEach(System.out::println);
    }
}
