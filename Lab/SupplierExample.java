package Lab;

import java.util.function.Supplier;

class RandomValueSupplier implements Supplier<Double> {

    @Override
    public Double get() {
        return Math.floor(Math.random() * 10);
    }

}

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<Double> randomValueSupplier = () -> Math.floor(Math.random() * 10);

        System.out.println(randomValueSupplier.get());
    }
}
