package homework11Task4;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Generator {
    public static void main(String[] args) {

        RandomNumber randomNumber = new RandomNumber(25214903917L, 11L, (long) Math.pow(2, 48));
            Stream<Long> generator = Stream.iterate(0L, (seed) -> randomNumber.nextElement(seed));
            generator.limit(5)
            .peek(System.out::println)
            .collect(Collectors.toList());
    }
 }

