## First Program

```
    public class HelloWorld {
        public static void main (String[] args) {
            System.out.println("Hello World");
        }
    }
```

## Java Keywords

Following is list of all keywords in java

![java keywords](./images/java-keywords.png)

## Print first number

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

## Starting out with Expressions

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

## 8 Primitive data types in java

![primitive data types in javas](./images/Primitive.png)
