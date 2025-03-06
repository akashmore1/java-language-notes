package arrays.operations;

import java.util.Arrays;
import java.util.Random;

public class BinarySearch {
    public static void stringArrBinarySearch(String[] names) {
        Arrays.sort(names);
        int elementLocation = Arrays.binarySearch(names, "Akash");
        if(elementLocation < 0) {
            System.out.println("Akash is not present in array");
        }
        else{
            System.out.println("Akash is present in array");
        }
    }

    public static void numberArrBinarySearch(int[] numbers) {
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        int elementLocation = Arrays.binarySearch(numbers, 44);
        if(elementLocation < 0) {
            System.out.println("Number 44 is not present in array");
        }
        else{
            System.out.println("Number 44 is present in array");
        }
    }

    public static void callBinarySearchFunctions() {
        String[] names = {"Mustejab", "Harshil", "Akash", "Omkar", "Aastha"};
        stringArrBinarySearch(names);

        Random random = new Random();

        int[] randomNumbers = new int[20];

        for(int i = 0; i < randomNumbers.length; i++){
            randomNumbers[i] = random.nextInt(40, 60);
        }

        numberArrBinarySearch(randomNumbers);

        int[] a = {1,2,3};
        int[] b = {1,2,3};
        areArraysEqual(a, b);

        if(areArraysEqual(a, b)){
            System.out.println("Arrays are equal");
        }
        else {
            System.out.println("Arrays are not equal");
        }
    }

    public static boolean areArraysEqual(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }
}
