package lesson9;

import java.util.*;
import java.util.stream.IntStream;

public class Task9 {
    public static void main(String[] args) {
        // 1.
        long count = IntStream.of(-5, -4, -3, 2, 3, 4, 88).filter(w -> w % 2 ==0).count();
        System.out.println(count);

        // 2.
        List<String> lines = new ArrayList<>();
        Collections.addAll(lines, "Highload", "High", "Load", "Highload");
        System.out.println(lines.stream().filter(s -> s.equals("High")).count());

        Optional<String> first = Optional.of(lines.stream().findFirst().orElse("0"));
        System.out.println(first.get());

        System.out.println(lines.stream().reduce((a,b) -> b).orElse("0"));

        // 3.
        List<String> element = new ArrayList<>();
        Collections.addAll(element,  "f10", "f15", "f2", "f4", "f4");
        element.stream().sorted().forEach(System.out::println);
        String[] array = element.toArray(new String[0]);
        System.out.println(Arrays.toString(array));
    }
}
