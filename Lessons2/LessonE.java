package Lessons2;

import java.util.function.Predicate;

public class LessonE {
    public static void main(String[] args){
        Predicate<String> predicate = s -> s.length() == 3;


        System.out.println(predicate.test("pre"));
    }
}
