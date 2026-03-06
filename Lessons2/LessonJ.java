package Lessons2;

class Calculator{
    int num;

    public Calculator(int num){
        this.num = num;
    }
}

public class LessonJ {
    public static void main(String[] args) {
        Calculator calc = new Calculator(5);

        System.out.println(calc.num);

        Calculator newCalc = calc;

        System.out.println(newCalc.num);

        newCalc.num = 67;

        System.out.println(calc.num);


        
    }
}
