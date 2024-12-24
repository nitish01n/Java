package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCreation {

    public static void main(String[] args)
    {
        ArrayList<Integer> al = new ArrayList<>();
        int[] arr = new int[]{1,2,3,4,5};
        al.add(0,1);
        al.add(1,13);
        al.add(2,23);
        al.add(3,32);
        al.add(4,91);
//        collectionStream(al);
//        arrayStream(arr);
//        streamOfMethod();
//        streamRange();
//        infiniteStream();
        streamBuilder();
    }

    public static void collectionStream(ArrayList<Integer> al)
    {
        System.out.println("Collection to streams: ");
        Stream<Integer> stream = al.stream();
        stream.forEach(System.out::print);
//        stream.forEach(n -> System.out.print(n+" "));
    }

    public static void arrayStream(int[] arr)
    {
        System.out.println("Array to streams: ");
        Stream<int[]> stream = Arrays.stream(new int[][]{arr});
//        Stream<int[]> stream = Arrays.stream(arr);
        stream.forEach(n -> System.out.println(Arrays.toString(n)));
    }

    public static void streamOfMethod()
    {
        int a=1,b=2,c=3,d=4;
        System.out.println("Streams using of Method: ");
        Stream<Integer> al1  = Stream.of(1,2,3,4,5,6,7,8,9,0);
        Stream<Integer> al2 = Stream.of(a,b,c,d);
        al1.forEach(System.out::println);
    }

    public static void streamRange()
    {
        System.out.println("Stream from Range of numbers: ");
        IntStream stream = IntStream.rangeClosed(1,5);
        stream.forEach(System.out::println);
        IntStream stream1 = IntStream.range(1,5);
        stream1.forEach(System.out::println);

    }

    public static void infiniteStream()
    {
        System.out.println("Infinite Stream: ");
        Stream<Integer> stream = Stream.iterate(0,n -> n);
        stream.limit(5).forEach(n->System.out.print(n+" "));

        Stream<Double> stream1 = Stream.generate(Math::random);

        stream1.limit(5).forEach(n->System.out.print(n+" "));
    }

    public static void streamBuilder()
    {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        Stream<List<Integer>> stream = Stream.< List<Integer> >builder()
                        .add(al)
                .add(al)
                .build();

        stream.forEach(System.out::println);
    }
}
