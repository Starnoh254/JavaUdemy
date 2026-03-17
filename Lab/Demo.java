package Lab;

import java.util.*;
import java.util.stream.Stream;


public class Demo {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();

        for(int i = 0; i <= 20 ; i++){
            nums.add(i);
        }

        System.out.println(nums);

        // Stream<Integer> s1 = nums.stream();
        // Stream<Integer> s2 = s1.filter(num -> num % 2 == 0);
        // Stream<Integer> s3 = s2.map(num -> num * 2);
        // int result = s3.reduce(0 , (c,e) -> c + e);

        int result = nums.stream()
            .filter(num -> num % 2 == 0)
            .map(num -> num * 2)
            .reduce(0,(c,e) -> c + e );




        // s3.forEach(System.out::println);
        System.out.println(nums);
        System.out.println(result);
        
    }
}
