public class LessonB {
    public static void main(String[] args){
        // Inheritance 

        AdvCalc calc = new AdvCalc();
        int r1 = calc.add(3,7);
        int r2 = calc.sub(12, 8);
        int r3 = calc.multiply(5, 8);
        int r4 = calc.divide(1000, 200);

        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4);
    }
}


