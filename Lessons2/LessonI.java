package Lessons2;

class Calculator {
    public int add(int a , int b){
        return a + b;
    }

    public int add(int a , int b , int c){
        return a + b + c;
    }
}

public class LessonI {
    public static void main(String[] args){

        Calculator calc = new Calculator();
        int result1 = calc.add(10,50);
        int result2 = calc.add(10,20,30);

        System.out.println("Result one is " + result1 + " Result two is " + result2);

    }
}
