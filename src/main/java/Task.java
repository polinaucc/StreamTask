import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, -4, 4, 0, 5, 6, 7, 0, 8, 9, 10};

        //find average
        System.out.println("Average: " +
                Arrays.stream(array)
                        .average()
                        .getAsDouble());

        //find minimal and its index (1)
        System.out.println("Min value: " +
                Arrays.stream(array)
                        .min()
                        .getAsInt());

        //find minimal value and its number
        IntStream.range(0, array.length)
                .reduce((a, b) -> array[a] < array[b] ? a : b)
                .ifPresent(i -> printStringValue("Min value: " + array[i] + " and index: " + i));

        //count elements that are 0
        System.out.println("The amount of 0: " +
                IntStream.of(array)
                        .filter(x -> x == 0)
                        .count()
        );

        // count elements that are greater than 0
        System.out.println("The amount of elements that are greater than 0: " +
                IntStream.of(array)
                        .filter(x -> x > 0)
                        .count());

        //multiply elements of array to a number
        IntStream.of(array)
                .map(x -> x * 2)
                .forEach(Task::printNumber);
    }

    public static void printNumber(int number) {
        System.out.print(number + " ");
    }

    public static void printStringValue(String str) {
        System.out.println(str);
    }
}
