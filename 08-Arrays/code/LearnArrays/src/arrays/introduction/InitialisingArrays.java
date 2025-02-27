package arrays.introduction;

import java.lang.reflect.Array;
import java.util.Arrays;

public class InitialisingArrays {

    // Create an array of first 100 numbers from 1 to 100
    public static void first100Numbers() {
        int[] first100Nums = new int[100];

        for(int i = 1; i <= 100; i++) {
            first100Nums[i - 1] = i;
        }

        System.out.println(Arrays.toString(first100Nums));
    }
}
