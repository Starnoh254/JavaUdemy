package Lessons2;

public class LessonO {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        sb.delete(0, 1);

        System.out.println(sb);
    }
}
