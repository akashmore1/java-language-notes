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

| Array Variable Declaration |
| -------------------------- |
| `int[] integerArray`       |
| `String[] nameList`        |
| `String courseList[]`      |

1. When you declare an array, you first specify the type of the elements you want in the array.
2. Then you include square brackets in the declaration, which is the key for Java to identify the variable as an array.
3. The square brackets can follow the type as shown in the first two examples.
4. You can also put the square brackets after the variable name as shown in the last example.
5. The first approach is much more common.
6. Note that you don't specify a size in the array declaration itself.

# Instantiating an Array

| Array Creation                    | Object creation                         |
| --------------------------------- | --------------------------------------- |
| int[] integerArray = new int[10]; | StringBuilder sb = new StringBuilder(); |

1. They look pretty similar, but there are two major differences when creating arrays.
2. Square brackets are required when using the new keyword and a size is specified between them. So, in this example, there will be 10 elements in the array.
3. An array instantiation doesn't have a set of parentheses, meaning we can't pass data to a constructor for an array.
