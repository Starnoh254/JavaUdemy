package lessons;

public class LessonL {
    public static void main(String[] args){
        int x = 5;
        // int y = x++; // post increment i.e use the current value first ... then increase it.

        // int z = ++x; // pre increment i.e increase first ... then use the value 

        // System.out.println(x++);
        // System.out.println(x);

        int result = x++ + ++x;
        System.out.println(result);
    }
}
