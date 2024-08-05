package org.una.programmingIII.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPractice {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 5, 7, 2, 8, 1, 4, 10, 6, 9);
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "elderberry", "fig", "grape");

        System.out.println("Map Example: " + squareAndSortNumbers(numbers));
        System.out.println("Filter Example: " + filterAndSortLongStrings(strings));
        System.out.println("Reduce Example: " + totalLengthOfStrings(strings));
    }

    public static List<Integer> squareAndSortNumbers(List<Integer> numbers) {
        return numbers.stream()
                .map(n -> n * n)
                .sorted()
                .collect(Collectors.toList());
    }

    public static List<String> filterAndSortLongStrings(List<String> strings) {
        return strings.stream()
                .filter(s -> s.length() > 5)
                .sorted()
                .collect(Collectors.toList());
    }

    public static Integer totalLengthOfStrings(List<String> strings) {
        return strings.stream()
                .map(String::length)
                .reduce(0, Integer::sum);

    }
}
