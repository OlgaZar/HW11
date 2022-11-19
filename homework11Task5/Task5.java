package homework11Task5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class Task5 {
    public static void main(String[] args) {
        Stream<String> first = Stream.of("one1", "two1", "three1", "four1", "five1", "six1");
        Stream<String> second = Stream.of("one2", "two2", "three2", "four2");

        zip(first, second);
    }

        public static <T> Stream<T> zip(Stream<T> first, Stream<T>second) {
            Iterator<T> iteratorOfFirst = first.iterator();
            Iterator<T> iteratorOfSecond = second.iterator();
            List<T> result = new ArrayList<>();
            while (iteratorOfFirst.hasNext() && iteratorOfSecond.hasNext()) {
                result.add(iteratorOfFirst.next());
                result.add(iteratorOfSecond.next());
            }
            System.out.println("result = " + result);
            return result.stream();

       }
    }

