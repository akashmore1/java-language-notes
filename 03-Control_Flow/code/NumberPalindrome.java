public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        int positiveNumber = number;
        if (number < 0) {
            positiveNumber *= -1;
        }

        int reversedNumber = 0;
        int tempNumber = positiveNumber;

        while (tempNumber != 0) {
            reversedNumber = (reversedNumber * 10) + (tempNumber % 10);
            tempNumber = tempNumber / 10;
        }

        return reversedNumber == positiveNumber;
    }

    public static void main(String[] args) {
        isPalindrome(101);
    }
}
