package Lessons2;


// Annotations in java 
class A {
    public void show(){
        System.out.println("I am in A show");
    }
}

class B extends A {
    @Override
    public void show(){
        System.out.println("I am in B show");
    }
}


public class LessonC {

    public static void main(String[] args){
        A obj = new B();
        obj.show();

    }
    
}
