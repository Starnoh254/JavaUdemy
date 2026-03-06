package Lessons2;

import java.util.Arrays;

public class LessonK {
    public static void main(String[] args) {
        int nums[] = {5,6,7,8}; // Array declaration

        int i = 0;
        for(int num : nums){

            if(i == 0)
                System.out.println("I am inside an enhanced loop");
            System.out.println(num);
            i++;
        }

        

        System.out.println(Arrays.toString(nums));
    }
}
