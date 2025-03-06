package arrays.operations;

import java.util.Arrays;
import java.util.Random;

public class ArrayOperations {
    public static int[] getRandomArray(int len) {
        Random random = new Random();
        int[] randomArr = new int[len];
        for(int i = 0; i < len; i++) {
            randomArr[i] = random.nextInt(100);
        }
        return randomArr;
    }

    public static int[] getSortedArray(int[] randomArray) {
        Arrays.sort(randomArray);
        return randomArray;
    }

    public static int[] fillValuesInArray() { // returns [4, 4, 4, 4, 4, 4, 4, 4, 4, 4]
        int[] someArray = new int[10];
        Arrays.fill(someArray, 4);
        return someArray;
    }

    public static int[] getCopyOfArray () {
        int[] randomArr = getRandomArray(10);
        int[] copiedArray1 = Arrays.copyOf(randomArr, 10);
        int[] copiedArray2 = Arrays.copyOf(randomArr, 14); // Adds zero for last 4 extra elements
        int[] copiedArray3 = Arrays.copyOf(randomArr, 7); // Trims last 3 elements
        return copiedArray1;
    }
}
