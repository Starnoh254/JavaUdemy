package lessons;

abstract class Vehicle {
    abstract void move(); // no implementation

    void stop() {
        System.out.println("Vehicle stopped");
    }
}

class Car extends Vehicle {

    @Override
    void move() {
        System.out.println("Car moves using engine");
    }

}

class Bicycle extends Vehicle {

    @Override
    void move() {
        System.out.println("Bicycle moves using pedals");
    }
    
}

public class LessonT {
    public static void main(String[] args) {

        Vehicle v = new Car();
        v.move();

        v = new Bicycle();
        v.move();

    }
}
