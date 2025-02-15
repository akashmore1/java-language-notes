public class SumOddRange {
    public static boolean isOdd(int number) {
        if (number < 0) {
            return false;
        } else if (number % 2 == 0) {
            return false;
        }
        return true;
    }

    public static int sumOdd(int start, int end) {
        if (start < 0 || end < 0 || start > end) {
            return -1;
        }

        int sumOfAllOddNums = 0;

        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sumOfAllOddNums += i;
            }
        }

        return sumOfAllOddNums;
    }
}
