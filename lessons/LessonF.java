package lessons;


class A {
    public void show(){
        System.out.println("in A show");
    }
}

class B extends A {

    @Override
    public void show(){
        System.out.println("in B show");
    }
}


class C extends A {
    @Override
    public void show(){
        System.out.println("in C show");
    }
}

public class LessonF {
    public static void main(String[] args){
        A obj = new A();
        obj.show(); // prints in A show

        obj = new B();
        obj.show();// prints in B show


        obj = new C();
        obj.show(); // prints in C show
    }
}
