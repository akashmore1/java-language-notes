public class Factorial {

    private static long getFactorial(long number) {
        long factorial = 1;
        for (long i = number; i > 0; i--) {
            factorial = factorial * i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        long factorial = getFactorial(4);

        System.out.println("factorial: " + factorial);
    }
}
