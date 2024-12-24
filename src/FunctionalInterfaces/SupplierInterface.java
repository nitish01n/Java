package FunctionalInterfaces;

import java.util.function.Supplier;

public class SupplierInterface {

    public static void main(String[] args)
    {
//        Supplier<Double> randomSupplier = () -> Math.random();
        Supplier<Double> randomSupplier = Math::random;

        System.out.println(randomSupplier.get());
    }
}
