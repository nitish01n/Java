package FunctionalInterfaces;
import java.util.function.Function;
public class FunctionInterface {

    public static void main(String[] args) {

//        Function<String,Integer> stringLength = (String str) -> str.length();
        Function<String,Integer> stringLength = String::length;
        System.out.println(stringLength.apply("Hello")); // Output: 5
    }
}
