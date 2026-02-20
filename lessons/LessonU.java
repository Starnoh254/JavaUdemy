package lessons;

class Car {

    private static String model = "BMW"; // inner classes can access private field

    static class Engine {
        void start() {
            System.out.println("Engine started");
        }

        void showModel(){
            System.out.println(model);
        }
    }
}

public class LessonU {
    public static void main(String[] args) {

        // Car car = new Car();

        // Car.Engine engine= car.new Engine();

        Car.Engine engine = new Car.Engine();

        engine.start();
        engine.showModel();

    }
}
