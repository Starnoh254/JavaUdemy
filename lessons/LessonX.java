package lessons;

interface A {
    void show();

    void config();
}

class B implements A {

    @Override
    public void show() {
        System.out.println("In B show");
    }

    @Override
    public void config() {
        System.out.println("In B config");
    }

}

public class LessonX {
    public static void main(String[] args) {

        A obj = new B();
        obj.show();
        obj.config();

    }
}
