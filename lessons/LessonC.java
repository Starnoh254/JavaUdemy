package lessons;
// this and super method 
// create a new object of type B , prints : 
// in A 
// in B
// This is because of the super () method


class A extends Object{
    public A () {
        super();
        System.out.println("in A");
    }

    public A (int a){
        super();
        System.out.println("in A int");
    }

}

class B extends A {
    public B() {
        super();
        System.out.println("in B");
    }

    public B(int a) {
        this();
        System.out.println("in B int");
    }
}



public class LessonC {
    public static void main(String[] args){
        new B(4); // anonymous object
    }
}
