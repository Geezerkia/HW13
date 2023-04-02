import java.util.Arrays;
import java.util.Random;

public class Main {

    private static int[] numbs;

    public static void main(String[] args) {

        System.out.println("Unsorted array: " + Arrays.toString(numbsUnsorted()));
        System.out.println("Bubblesorted array: " + Arrays.toString(BubbleSort.bubbleSort(numbs)));
        System.out.println("Unsorted array: " + Arrays.toString(numbsUnsorted()));
        System.out.println("Insertionsorted array: " + Arrays.toString(InsertionSort.insertionSort(numbs)));
    }

    public static int[] numbsUnsorted() {
        numbs = new int[10];
        for (var i = 0; i < numbs.length; i++) {
            var random = new Random();
            numbs[i] = random.nextInt(10) + 1;
        }
        return numbs;
    }
}