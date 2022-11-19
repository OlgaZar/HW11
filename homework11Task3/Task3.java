package homework11Task3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {

    public static void main(String[] args) {
        String[] figures = new String[]{"1, 2, 0", "4, 5"};

        List<Integer>sortedFigures=
                Arrays.stream(figures)
                .map(line -> Arrays.asList(line.split(", ")))
                .flatMap(l -> l.stream())
                .map(item->Integer.parseInt(item))
                .sorted()
                .collect(Collectors.toList());

        System.out.println("sortedFigures = " + sortedFigures);

    }




}
