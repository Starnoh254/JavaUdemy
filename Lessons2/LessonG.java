package Lessons2;

public class LessonG {
    public static void main(String[] args) {

        try {
            Thread.sleep(10000);
        }

        catch(InterruptedException e){
            System.out.println("I caught the error");
        }
        
        System.out.println("Hello Geeks");
    }
}
