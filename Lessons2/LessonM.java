package Lessons2;

public class LessonM {
    public static void main(String[] args) {

        // jagged arrays 
        int nums[][] = new int[3][];

        nums[0] = new int[4];
        nums[1] = new int[3];
        nums[2] = new int[2];

        for(int[] num : nums){
            for(int n : num){
                n = (int)(Math.random()*10);
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}
