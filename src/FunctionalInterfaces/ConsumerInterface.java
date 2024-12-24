package FunctionalInterfaces;

import java.util.function.Consumer;

public class ConsumerInterface {

    public static void main(String[] args)
    {
        Consumer<String> printConsumer = System.out::println;
//        Consumer<String> printConsumer = (str)->System.out.println(str);

        printConsumer.accept("Hello, Consumer!");

    }
}
