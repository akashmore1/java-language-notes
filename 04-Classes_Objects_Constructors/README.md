# Object Oriented Programming

Object-Oriented Programming is a way to model real-world objects as software objects which contain both data and code.

### Class based Programming

1. Modelling real-world objects as software objects is a fundamental part of Object-Oriented Programming.
2. A software object stores its state in fields, which can also be called variables or attributes.
3. Objects expose their behavior with methods which I've talked about before.
4. So, where does a class fit in?
5. Well, think of a class as a template or a blueprint for creating objects.

### The Class as blueprint

1. The class describes the data (fields), and the behavior (methods), that are relevant to the real-world object we want to describe.
2. These are called class members.
   ![alt text](./images/class_blueprint.png)
3. A class member can be a field or a method, or some other type of dependent element.
4. If a field is static, there is only one copy in memory, and this value is associated with the class or template itself.
5. If a field is not static, it's called an instance field, and each object may have a different value stored for this field.
6. A static method can't be dependent on any one object's state, so it can't reference any instance members.
7. In other words, any method that operates on instance fields needs to be non-static.

# Organizing classes

1. Classes can be organized into logical groupings which are called packages.
2. You declare a package name in the class using the package statement.
3. If you don't declare a package, the class implicitly belongs to the default package.

### Access modifiers for class members

1. An access modifier at the member level allows granular control over class members.
2. The valid access modifiers are shown in this table from the least restrictive to the most restrictive.

| Access Keyword | Description                                                                                                                                         |
| -------------- | --------------------------------------------------------------------------------------------------------------------------------------------------- |
| public         | public means any other class in any package can access this class.                                                                                  |
| protected      | protected allows classes in the same package, and any subclasses in other packages, to have access to the member.                                   |
|                | When the modifier is omitted, this has special meaning, called package access, meaning the member is accessible only to classes in the same package |
| private        | private means that no other class can access this member                                                                                            |

# Default values of data types

### What is null?

1. null is a special keyword in Java, meaning, the variable or attribute has a type but no reference to an object.
2. This means that no instance or object is assigned to the variable or field.
3. Fields with primitive data types are never null.
4. String can be null

Fields on classes are assigned default values automatically by Java, if you don't assign values yourself.
| Data type assigned | Default value assigned |
|--------------------|------------------------|
| boolean | false|
| byte, short, int, long, char | 0 |
| double, float | 0.0 |

# Constructor

1. A constructor is used in the creation of an object.
2. It is a special type of code block that has a specific name and parameters, much like a method.
3. It has the same name as the class itself, and it doesn't return any values.
4. You never include a return type from a constructor, not even void.
5. You can, and should, specify an appropriate access modifier to control who should be able to create new instances of the class, using this constructor.

```
public class Account {  // This is class declaration
    public Account() {  // This is constructor declaration
        // constructor code is code to be executed as the object is created
    }
}
```

### The default constructor

1. If a class contains no constructor declarations, then a default constructor is implicitly declared.
2. This constructor has no parameters and is often called the no-args (no arguments) constructor.
3. If a class contains any other constructor declarations, then a default constructor is NOT implicitly declared.

### Constructor overloading

1. Constructor overloading is declaring multiple constructors with different parameters.
2. The number of parameters can be different between constructors.
3. Or if the number of parameters is the same between two constructors, their types, or order of the types must differ.

### Constructor chaining

1. Constructor chaining is when one constructor explicitly calls another overloaded constructor.
2. You can only use constructor chaining, within constructors.
3. You must use the special statement this() to execute another constructor, passing it arguments if required.
4. And this() must be the first executable statement if it's used from another constructor.

```
public class Person {
    private String name;
    private int age;

    public Person() { // Empty constructor
        this("default_name", 21);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
```

(Check Customer class in code folder to see constructor overloading and constructor chaining)

# Reference vs Object vs Instance vs Class

1. Objects are reference type (Call by reference)
2. Primitive data types of value type (Call by value)
   ![alt text](./images/Object-class-instance.png)

Lets say there is a class named Person.
Following line executes fine

```
public class Main {
    public static void main() {
        new Person();  // --> executes fine
    }
}
```

Bute because we have not assigned it any variable, there is no way to access any attribute or method of that object

# Static vs Instance Variables

It is considered best practice to use the Class name and not a reference variable to access a static variable.

```
public class Dog {
    private static String genus = "Canis";
    private String name = "Tommy";

    public void printAttributes () {
        System.out.println(Dog.genus);  // Best practice

        Dog d1 = new Dog();
        System.out.println(d1.name);   // Instance variables need to be called like this
    }
}
```

### Static variables

1. Declared by using the keyword static.
2. Static variables are also known as static member variables.
3. Every instance of the class shares the same static variable.
4. If changes are made to that variable, all other instances of that class will see the effect of that change.
5. Static variables aren't used very often but can sometimes be very useful.
6. They can be used for:
   a. Storing counters.
   b. Generating unique IDs.
   c. Storing a constant value that doesn't change, like PI, for example.
   d. Creating and controlling access to a shared resource.

### Instance variables

1. They don't use the static keyword.
2. They're also known as fields or member variables.
3. Instance variables belong to a specific instance of a class.
4. Each instance has its own copy of an instance variable.
5. Every instance can have a different value.
6. Instance variables represent the state of a specific instance of a class.

# Static vs Instance Methods

### Static methods

1. Static methods are declared using a static modifier.
2. Static methods can't access instance methods and instant variables directly.
3. They're usually used for operations that don't require any data from an instance of the class (from 'this').
4. If you remember, the **this** keyword is the current instance of a class.
5. Inside a static method, we can't use the **this** keyword.
6. Whenever you see a method that doesn't use instance variables, that method should probably be declared as a static method.
7. For example, main is a static method and it's called by the Java virtual machine when it starts the Java application.

### Instance methods

1. Instance methods belong to an instance of a class.
2. To use an instance method, we have to instantiate the class first, usually by using the new keyword.
3. Instance methods belong to an instance of a class.
4. To use an instance method, we have to instantiate the class first, usually by using the new keyword.
5. Instance methods can access instance methods and instance variables directly.
6. Instance methods can also access static methods and static variables directly.

### Static or Instance method

![alt text](./images/Static_or_Instance.png)

# The POJO

### Plain Old Java Object

1. A plain old Java object (whose acronym is POJO) is a class that generally only has instance fields.
2. It's used to house data and pass data between functional classes.
3. It usually has no other, or very few methods, other than getters and setters for the instance fields.
4. Many database frameworks use POJO's to read data from, or to write data to databases, files or streams.

### Examples of POJOs

5. A POJO also might be called a bean or a JavaBean.
6. A JavaBean is just a POJO with some extra rules applied to it.
7. A POJO is sometimes called an Entity because it mirrors database entities.
8. Another acronym is DTO for Data Transfer Object.
9. It's a description of an object that can be modeled as just data.

### Support for POJOs

1. There are many generation tools that will turn a data model into generated POJO's or JavaBeans.
2. You've seen an example of similar code generation in IntelliJ, which allowed me to generate getters, setters, and constructors in a uniform way.

### Annotation

1. Annotations are a type of metadata.
2. Metadata is a way to formally describe additional information about our code.
3. Annotations are more structured and have more meaning than comments.
4. This is because they can be used by the compiler or other types of pre-processing functions, to get information about the code.
5. Metadata doesn't affect how the code runs so this code will still run with or without the annotation.

### Overridden Method

1. An overridden method is not the same thing as an overloaded method.
2. An overridden method is a special method in Java that other classes can implement if they use a specified method signature.

# The Record (Java's Implicit POJO Type)

1. Plain Old Java Object (POJO) comes with a lot of boilerplate code.
2. It's the code that's repetitive and follows certain rules.
3. Once created, this code is rarely looked at, or modified.
4. In fact, there are tools that'll just regenerate all of this code if your underlying data or domain model changes.

### The Record Type

1. The record was introduced in JDK 14 and became officially part of Java in JDK 16.
2. It's purpose is to replace the boilerplate code of the POJO but to be more restrictive.
3. Java calls them "plain data carriers".
4. The record is a special class that contains data that's not meant to be altered.
5. In other words, it seeks to achieve immutability for the data in its members.
6. It contains only the most fundamental methods, such as constructors and accessors.
7. Best of all, you, the developer, don't have to write or generate any of this code.

### Implicit or Generated Code that Java provides

What does Java tell us about what is implicitly created when we declare a record as it is done in this code?

```
public record Student(String id, String name, String dateOfBirth, String classList) {

}
```

First, it's important to understand that the part that's in parentheses, is called the record header.
The record header consists of record components, a comma-delimited list of components.

(The above code replaces all pojo code, we write with getters and setters)

**How to access above record type class?**

```
Student recordStudent = new Student("student_id", "Akash", "30-10-1998", "Java, springboot, devops");
<!-- We can print recordStudent, as record in built has toString method -->
System.out.println(recordStudent);

<!-- If want to access any of the field, like id we can do the following -->
String name = recordStudent.name();
String id = recordStudent.id();
String dob = recordStudent.dateOfBirth();
String classList = recordStudent.classList();
```

### Why have an immutable record?

There are more use cases for immutable data transfer objects and keeping them well encapsulated. You want to protect the data from unintended mutations.

### POJO vs. Record

1. If you want to modify data on your class, you won't be using the record.
2. You can use the code generation options for the POJO.
3. But if you're reading a whole lot of records from a database or file source and simply passing this data around, then the record is a big improvement.

### Java's new type, the record

1. I've only touched on some of the features of the record to give you an introduction.
2. When I do talk more about the final keyword and immutability of data, especially as it may be affected by concurrent threads, we'll be revisiting this type.
3. I'll also be showing it to you in action, when we get to the Database and I/O sections of this course.
