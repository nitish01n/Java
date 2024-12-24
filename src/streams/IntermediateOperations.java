package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntermediateOperations {

    public static void main(String[] args)
    {
//        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
//        Stream<Integer> evenNumbers = numbers.stream().filter(n ->n % 2 == 0);
//        evenNumbers.forEach(System.out::println); // Output: 2, 4

        List<String> names = List.of("john", "paul", "george", "ringo");
        Stream<String> upperCaseNames = names.stream().map(String::toUpperCase);
        upperCaseNames.forEach(System.out::println); // Output: JOHN, PAUL, GEORGE, RINGO

//        List<String> sentences = List.of("hello world", "java streams");
//        Stream<String> words = sentences.stream().flatMap(s -> Arrays.stream(s.split(" ")));
//        words.forEach(System.out::println); // Output: hello, world, java, streams

//        List<Integer> numbers1 = List.of(1, 2, 3, 3, 4, 5, 1, 2);
//        Stream<Integer> distinctNumbers = numbers1.stream().distinct();
//        distinctNumbers.forEach(System.out::println); // Output: 1, 2, 3, 4, 5

//        List<Integer> numbers2 = List.of(5, 2, 8, 1, 3);
//        Stream<Integer> sortedNumbers = numbers2.stream().sorted();
//        sortedNumbers.forEach(System.out::println); // Output: 1, 2, 3, 5, 8

//        Stream<Integer> sortedDescending = numbers.stream().sorted(Comparator.reverseOrder());
//        sortedDescending.forEach(System.out::println); // Output: 8, 5, 3, 2, 1
//
//        List<Integer> numbers3 = List.of(1, 2, 3, 4, 5);
//        Stream<Integer> peekStream = numbers3.stream().peek(n -> System.out.println("Processing: " + n));
//        peekStream.forEach(System.out::println); // Output: Processing: 1, Processing: 2, ..., followed by 1, 2, 3, 4, 5
//
//        List<Integer> numbers4 = List.of(1, 2, 3, 4, 5, 6, 7);
//        Stream<Integer> limitedStream = numbers4.stream().limit(3);
//        limitedStream.forEach(System.out::println); // Output: 1, 2, 3

//        List<Integer> numbers5 = List.of(1, 2, 3, 4, 5);
//        List<Integer> numberList = numbers5.stream().toList();
//        System.out.println(numberList); // Output: [1, 2, 3, 4, 5]

//        Stream<Integer> infiniteStream = Stream.iterate(1, n -> n + 1).limit(5);
//        infiniteStream.forEach(System.out::println); // Output: 1, 2, 3, 4, 5

//        String str = "Hello";
//        Stream<String> stream = Stream.ofNullable(str);
//        stream.forEach(System.out::println); // Output: Hello

//        str = null;
//        Stream<String> emptyStream = Stream.ofNullable(str);
//        emptyStream.forEach(System.out::println); // Output: (No output)

//        Stream<Integer> stream1 = Stream.of(1, 2, 3);
//        Stream<Integer> stream2 = Stream.of(4, 5, 6);
//        Stream<Integer> concatenatedStream = Stream.concat(stream1, stream2);
//        concatenatedStream.forEach(System.out::println); // Output: 1, 2, 3, 4, 5, 6

//        IntStream intStream = IntStream.of(1, 2, 3, 4);
//        Stream<Integer> boxedStream = intStream.boxed();
//        boxedStream.forEach(System.out::println); // Output: 1, 2, 3, 4

//        List<String> words1 = List.of("one", "three", "five");
//        IntStream lengths = words1.stream().mapToInt(String::length);
//        lengths.forEach(System.out::println); // Output: 3, 5, 4

//        List<Integer> numbers6 = List.of(1, 2, 3, 4, 5);
//        Stream<Integer> skippedStream = numbers6.stream().skip(2);
//        skippedStream.forEach(System.out::println); // Output: 3, 4, 5

//        List<Integer> numbers7 = List.of(1, 2, 3, 4, 5, 6);
//        Stream<Integer> takeWhileStream = numbers7.stream().takeWhile(n -> n < 4);
//        takeWhileStream.forEach(System.out::println); // Output: 1, 2, 3

//        List<Integer> numbers8 = List.of(1, 2, 3, 4, 5, 6);
//        Stream<Integer> dropWhileStream = numbers8.stream().dropWhile(n -> n < 4);
//        dropWhileStream.forEach(System.out::println); // Output: 4, 5, 6

    }
}
