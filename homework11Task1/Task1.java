package homework11Task1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        List<String> listOfName = List.of("Ivan", "Mariya", "Peter", "Oleg", "Stepan", "Tanya");
        String result = convertToString(listOfName);
        System.out.println("result = " + result);
   }

       public static String convertToString (List<String> listOfName) {
            List<String> result = new ArrayList<>();
            int i = 0;
            for (String name : listOfName) {
                if (i%2!=0) {
                   name = i+". "+name;
                    result.add(name);}
                    i++;
                }
            return  result.stream()
                    .collect(Collectors.joining(", "));
        }
    }
