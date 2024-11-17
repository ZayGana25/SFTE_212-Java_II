
package week9;

// import java.util.Arrays;
// import java.util.Collection;
// import java.util.List;
// import java.util.stream.Collectors;
// import java.util.stream.IntStream;
// import java.util.stream.Stream;

import java.util.*;
import java.util.stream.*;

// A Stream is a sequence of elements upon which sequential and 
// parallel aggregate operations can be performed

public class StreamJava {
    public static void main(String[] args) {
        System.out.println("Streams in Java");

        Stream<String> fruitStream = Stream.of("apple", "banana", "pear", "kiwi", "orange");
        fruitStream.filter(s -> s.contains("a"))
                            .map(String::toUpperCase)
                            .sorted()
                            .forEach(System.out::println);

        IntStream.range(1, 10).filter(a -> a % 3 == 0).forEach(System.out::println);

        List<String> data = Arrays.asList("One", "Two", "Three", "Four", "Five");
        // data.sort(null);
        Stream<String> aParallelStream = data.parallelStream();
        aParallelStream.forEachOrdered(System.out::println);

        Collection<String> abc = Arrays.asList("a", "b", "c");
        Collection<String> digits = Arrays.asList("1", "2", "3");
        Collection<String> greekAbc = Arrays.asList("alpha", "beta", "gamma");



        Stream<String> info = Stream.of("Isaiah", "Lugo", "20097", "ilugo@buhsnell.edu", "541-***-***");
        //info.filter(s -> s.contains("541"))
                            info.forEach(System.out::println);
        
        Stream<String> days = Stream.of("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday");
        List<String> dayList = days.collect(Collectors.toList());
        Collections.reverse(dayList);
        dayList.forEach(System.out::println);



        final Stream<String> concat1 = Stream.concat(
        Stream.concat(abc.stream(), digits.stream()), greekAbc.stream());
        System.out.println(concat1.collect(Collectors.joining(", ")));

    }

    
}