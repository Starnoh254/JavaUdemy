package lessons;

class Animal {

    void sound() {
        System.out.println("Animal sound");
    }


}

class Dog extends Animal {
    void sound() {
        System.out.println("Bark");
    }
}

public class LessonI {
    public static void main(String[] args){
        // Primitive typecasting 
        // implicit (automatic typecasting)

        int x = 10;
        double y = x;

        System.out.println(y);


        // Eplicit(manual typecasting)

        double a = 10.5;
        int b = (int) a;

        System.out.println(b);

        Animal d = new Dog(); // UPCASTING
        Dog c = (Dog) d; // DOWNCASTING

        c.sound();

    }
}
