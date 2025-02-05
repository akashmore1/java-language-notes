# First Program

```
    public class HelloWorld {
        public static void main (String[] args) {
            System.out.println("Hello World");
        }
    }
```

# Java Keywords

Following is list of all keywords in java

![java keywords](./images/java-keywords.png)

# Print first number

```
public class FirstNumber {

<!-- We will why below function needs to be static in future -->
    private static int getNumber(int num) {
        return num;
    }

    public static void main(String[] args) {
        int num = getNumber(4);
        num = num + num;
        System.out.println(num);
    }
}
```

# Starting out with Expressions

Write a program in java which gives factorial of given number

```
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
```

# 8 Primitive data types in java

![primitive data types in javas](./images/Primitive.png)

**Print smallest and largest integer in java**

```
public class Main {
    public static void main(String[] args) {
        int smallestInt = Integer.MIN_VALUE;
        int largestInt = Integer.MAX_VALUE;

        System.out.println(smallestInt + " " + largestInt);
        <!-- Output is: "-2147483648 2147483647" -->
    }
}
```

#### byte, short, int, long are other whole number data types in increasing order of range

`long largeNum = 40000000` will be considered int type by default so using prefix `long largeNum = 40000000L` is recommended.

# Type Casting in java

Mostly always use int

Supposedly, we have an integer
`int num = 4;`

and another byte
`byte halfNum = num/2;`

Above code will throw error as halfNum can have value which will not be in range of byte.
But if we know it will have value in range of byte, we can type cast the expression like below

`byte halfNum = (byte) (num/2);`

# `float` and `double` data types in java

`double` is java's default type for any decimal or real number

In Java, the range of a float is \(1.4\times 10^{-45}\) to \(3.4\times 10^{38}\), while the range of a double is \(4.9\times 10^{-324}\) to \(1.7976931348623157\times 10^{308}\).

Casting can be applied on float and double data types as well
