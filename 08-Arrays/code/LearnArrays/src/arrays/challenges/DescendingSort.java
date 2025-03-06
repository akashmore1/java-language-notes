package arrays.challenges;

import java.util.Arrays;
import java.util.Random;

public class DescendingSort {
    public static int[] reverseArray(int[] givenArr) {
        int start = 0;
        int end = givenArr.length -1;

        while(start < end) {
            int temp = givenArr[start];
            givenArr[start] = givenArr[end];
            givenArr[end] = temp;
            start++;
            end--;
        }

        return givenArr;
    }

    // Returns new array, sorted with descending order
    public static int[] getDescendingSortedArray(int[] randomArr) {
        int[] randomArrCopy = Arrays.copyOf(randomArr, randomArr.length);
        Arrays.sort(randomArrCopy);

        // Now reverse the array
        reverseArray(randomArrCopy);

        return randomArrCopy;
    }

    public static void doChallenge() {
        Random random = new Random();
        int[] nums = new int[20];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(40);
        }
        System.out.println(Arrays.toString(getDescendingSortedArray(nums)));
    }
}
