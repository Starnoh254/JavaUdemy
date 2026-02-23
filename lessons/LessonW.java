package lessons;

// Abstract and anonymous inner class

abstract class A {
    public abstract void show();
}


public class LessonW {
    public static void main(String[] args) {
        A obj = new A(){
            public void show() {
                System.out.println("In B show");
            }
        };
        obj.show();
    }
    
}
