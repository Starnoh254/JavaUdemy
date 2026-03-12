package Lab;

import java.util.*;

public class Exercise {
    public static void main(String[] args) {
        // I want to create an ArrayList that filters out odd numbers 

        List<Integer> nums = new ArrayList<>();
        for(int i = 0 ; i <= 10 ; i++){
            nums.add(i);
        }

        System.out.println("Original List : " + nums);

        Iterator<Integer> it = nums.iterator();
        while(it.hasNext()){
            int num = it.next();

            if(num % 2 != 0){
                it.remove();
            }
        }

        System.out.println("Modified List : " + nums);
    }
}
