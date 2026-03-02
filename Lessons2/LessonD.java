package Lessons2;

@FunctionalInterface
interface Calculator {

    int compute(int x , int y);

}

public class LessonD {
    public static void main(String[] args){

        Calculator calc = new Calculator() {

            @Override
            public int compute(int x, int y) {
                return x * y;
            }

        };

        int result = calc.compute(12 , 12);
        System.out.println(result);

    }
}
