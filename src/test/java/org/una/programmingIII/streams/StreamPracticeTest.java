package org.una.programmingIII.streams;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

public class StreamPracticeTest {
    @Test
    public void testMain() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        StreamPractice.main(null);

        System.setOut(originalOut);

        String expectedOutput = "Map Example: [1, 4, 9, 16, 25, 36, 49, 64, 81, 100]\n" +
                "Filter Example: [banana, cherry, elderberry]\n" +
                "Reduce Example: 39\n";
        String actualOutput = outContent.toString().replace("\r\n", "\n");
        expectedOutput = expectedOutput.replace("\r\n", "\n");

        assertEquals(expectedOutput, actualOutput);
    }
    @Test
    public void testSquareAndSortNumbers() {
        List<Integer> input = Arrays.asList(3, 5, 7, 2, 8, 1, 4, 10, 6, 9);
        List<Integer> expectedOutput = Arrays.asList(1, 4, 9, 16, 25, 36, 49, 64, 81, 100);

        List<Integer> actualOutput = StreamPractice.squareAndSortNumbers(input);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testSquareAndSortNumbers_EmptyList() {
        List<Integer> input = Collections.emptyList();
        List<Integer> expectedOutput = Collections.emptyList();

        List<Integer> actualOutput = StreamPractice.squareAndSortNumbers(input);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testSquareAndSortNumbers_NullList() {
        assertThrows(NullPointerException.class, () -> {
            StreamPractice.squareAndSortNumbers(null);
        });
    }

    @Test
    public void testFilterAndSortLongStrings() {
        List<String> input = Arrays.asList("apple", "banana", "cherry", "date", "elderberry", "fig", "grape");
        List<String> expectedOutput = Arrays.asList("banana", "cherry", "elderberry");

        List<String> actualOutput = StreamPractice.filterAndSortLongStrings(input);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testFilterAndSortLongStrings_EmptyList() {
        List<String> input = Collections.emptyList();
        List<String> expectedOutput = Collections.emptyList();

        List<String> actualOutput = StreamPractice.filterAndSortLongStrings(input);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testFilterAndSortLongStrings_NoLongStrings() {
        List<String> input = Arrays.asList("a", "b", "c", "d", "e", "f", "g");
        List<String> expectedOutput = Collections.emptyList();

        List<String> actualOutput = StreamPractice.filterAndSortLongStrings(input);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testFilterAndSortLongStrings_NullList() {
        assertThrows(NullPointerException.class, () -> {
            StreamPractice.filterAndSortLongStrings(null);
        });
    }

    @Test
    public void testTotalLengthOfStrings() {
        List<String> input = Arrays.asList("apple", "banana", "cherry", "date", "elderberry", "fig", "grape");
        Integer expectedOutput = 39;

        Integer actualOutput = StreamPractice.totalLengthOfStrings(input);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testTotalLengthOfStrings_EmptyList() {
        List<String> input = Collections.emptyList();
        Integer expectedOutput = 0;

        Integer actualOutput = StreamPractice.totalLengthOfStrings(input);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testTotalLengthOfStrings_NullList() {
        assertThrows(NullPointerException.class, () -> {
            StreamPractice.totalLengthOfStrings(null);
        });
    }
}
