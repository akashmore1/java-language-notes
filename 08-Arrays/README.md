# Arrays

1. An array is a data structure that allows you to store a sequence of values, all of the same type.
2. You can have arrays for any primitive type, like ints, doubles, booleans, or in fact, any of the 8 primitives we've learned about.
3. You can also have arrays for any class.
4. Elements in an array are indexed, starting at 0.
5. If we have an array storing five names, conceptually, it looks as shown here.
   | Index | 0 | 1 | 2 | 3 | 4 |
   | ------------ | ------------- | ------------- | ------------ | ------------- | ------------- |
   | Stored values in an array with 5 elements | "Andy" |"Bob" | "Charlie" | "David" | "Eve" |
6. The first element is at index 0 and is Andy.
7. The last element in this array is at index 4 and has the String value Eve.

# Declaring an Array

1. When you declare an array, you first specify the type of the elements you want in the array.
2. Then you include square brackets in the declaration, which is the key for Java to identify the variable as an array.
3. The square brackets can follow the type as shown in the first two examples.
4. You can also put the square brackets after the variable name as shown in the last example.
5. The first approach is much more common.
6. Note that you don't specify a size in the array declaration itself.
   | Array Variable Declaration |
   | -------------------------- |
   | `int[] integerArray` |
   | `String[] nameList` |
   | `String courseList[]` |

# Instantiating an Array

1. They look pretty similar, but there are two major differences when creating arrays.
2. Square brackets are required when using the new keyword and a size is specified between them. So, in this example, there will be 10 elements in the array.
3. An array instantiation doesn't have a set of parentheses, meaning we can't pass data to a constructor for an array.
   | Array Creation | Object creation |
   | --------------------------------- | --------------------------------------- |
   | int[] integerArray = new int[10]; | StringBuilder sb = new StringBuilder(); |

## An Array is not resizable

1. The size of an array, once created, is fixed.
2. In this case, integerArray will have 10 elements.
3. You can't change the size of an array after the array is instantiated.
4. You can't add or delete elements. You can only assign values to one of the ten elements in this array, in this example.
5. Note that Java has other capabilities to store elements that can be resized. We'll be looking at those in the next section.
6. For now its important to understand these basic arrays.

### General way to declare and initialize an array

```
public class LearnArray {
    public static void initiateArray () {
        int[] first10Number = new int[10];

        first10Number[0] = 1;
        first10Number[1] = 2;
        first10Number[2] = 3;
        first10Number[3] = 4;
        first10Number[4] = 5;
        first10Number[5] = 6;
        first10Number[6] = 7;
        first10Number[7] = 8;
        first10Number[8] = 9;
        first10Number[9] = 10;

        System.out.println(Arrays.toString(first10Number));
    }
}
```

# The Array Initializer

1. An array initializer makes the job of instantiating and initializing an array much easier.
   | The Array Initializer |
   | --------------------- |
   | int[] numbers = new int[]{1, 2, 3, 4, 5}; |

2. In this example, you can see I still use the new keyword and have int with the square brackets.
3. But here, I specify the values I want the array to be initialized to, in a comma-delimited list, within curly braces.
4. Because these values are specified, the length of the array can be determined by Java, so I don't then need to specify the size of the array in square brackets.
5. And actually, Java provides an even simpler way to do this.

# The array initializer as an anonymous array

Java allows us to drop the new int[] with brackets from the expression, as I'm showing here.
This is known as an anonymous array.
Here, I'm showing examples for both an int array as well as a String array.

| The Array Initializer                          |
| ---------------------------------------------- |
| int[] firstFourPositiveNumbers = {1, 2, 3, 4}; |
| String[] names = {"Akash", "Monty", "Nitin"};  |

An anonymous array initializer can only be used in a declaration statement.

i.e. **Below code is not allowed**

```
public class LearnArray {
    public static void initiateArray () {
        int[] first6Number;
        // first6Number = {1, 2, 3, 4, 5, 6}; // throws error
        first6Number = new int [] {1, 2, 3, 4, 5, 6}; // Works
        System.out.println(Arrays.toString(first10Number));
    }
}
```

# What exactly is an Array?

1. An array is a special class in Java.
2. It's still a class.
3. The array, like all other classes, ultimately inherits from java.lang.Object.

## Array initialization and default element values

When you don't use an array initializer statement, all array elements get initialized to the default value for that type.
For primitive types, this is zero for any kind of numeric primitive, like int, double, or short.
For booleans, the default value will be false.
And for any class type, the elements will be initialized to null.

For example

```
public class ArraysDefaultValues {
    public static void learnDefaultValuesInArray() {
        int[] first10Numbers = new int[10];
        System.out.println(Arrays.toString(first10Numbers));  // output: [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

        String[] names = new String[]{};
        System.out.println(Arrays.toString(names)); // output: []

        String[] months = new String[12];
        System.out.println(Arrays.toString(months)); // output: [null, null, null, null, null, null, null, null, null, null, null, null]
    }
}
```

# Enhanced **For loop** or **For Each Loop**

This loop was designed to walk through elements in an array or other collection types.

It processes one element at a time, from the first element to the last.

Here is the syntax for the two types of for loop statements, side by side.

| Enhanced For Loop                                      | Basic For Loop                                              |
| ------------------------------------------------------ | ----------------------------------------------------------- |
| for(declaration: collection) {// block of statements } | for(init; expression; increment;) {// block of statements } |

The enhanced for loop only has two components, versus three defined in the parentheses after the for keyword.

```
public class EnhancedForLoop {
    public static void learnForEach() {
        int[] first10Nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for(int i = 0; i < first10Nums.length; i++) {
            System.out.print(first10Nums[i] + " ");
        }
        System.out.println("");
        // Enhanced For loop:
        for(int num: first10Nums) {
            System.out.print(num + " ");
        }

    }
}
```

# java.util.Arrays

Java's array type is very basic, it comes with very little built-in functionality.

It has a single property or field, named length.

And it inherits java.util.Object's functionality.

Java provides a helper class named java.util.Arrays, providing the common functionality you'd want for many array operations.

These are static methods on Arrays, they are class methods, not instance methods.

## Printing elements in an array using Arrays.toString()

The toString method in this helper class prints out all the array elements, comma delimited, and contained in square brackets.

The output from this method is shown here conceptually.

It prints the element at index 0 first, followed by a comma, then the element at index 1 next, a comma, and so on, until all elements are printed.

## Why use arrays?

1. We use arrays to manage many items of the same type.
2. Some common behaviors for arrays include sorting, initializing values, copying the array, and finding an element.
3. This behavior isn't on the array instance itself, but rather provided on a helper class, java.util.Arrays.
