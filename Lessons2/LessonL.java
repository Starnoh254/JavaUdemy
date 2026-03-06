package Lessons2;

public class LessonL {
    public static void main(String[] args) {
        int nums[][] = new int[4][4];

        for(int i = 0 ; i < 4 ; i++){
            for(int j = 0 ; j < 4 ; j++){
                nums[i][j] = (int)(Math.random() * 100);
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }
}
