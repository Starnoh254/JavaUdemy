package lessons;

public class LessonY {
    public static void main(String[] args) {

        try {
            int s = 10 / 0;
            System.out.println(s);
        } catch (Exception e) {
            System.out.println("An error occurred : " + e.getMessage());
        }

        System.out.println("Bye");

    }
}
