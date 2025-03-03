package arrays.operations;

import java.util.Random;

public class RandomArray {
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
}