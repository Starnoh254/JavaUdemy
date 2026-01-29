public class Vehicle {
    protected int speed;
}


class Car extends Vehicle {
    void accelerate(){
        speed += 10;
    }
}
