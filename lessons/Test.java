package lessons;

class A {
    int number;
}



public class Test {
    public static void main(String[] args){
        A a = new A();
        A b = a;

        System.out.println(a.equals(b));

    }
}
