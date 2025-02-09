# Inheritance

1. What is Inheritance, and why is it so powerful?
2. We can look at Inheritance as a form of code reuse.
3. It's a way to organize classes into a parent-child hierarchy, which lets the child inherit (reuse), fields and methods from its parent.

![alt text](./image/Animal_inheritance.png)

1. Each box on this diagram represents a Class.
2. The most generic, or base class, starts at the top of the hierarchy.
3. Every class below it is a subclass.
4. So Animal is the base class. All the other classes can be said to be subclasses of Animal.
5. A parent can have multiple children, as we see with Mammal, which is the parent of Dog and Cat.
6. A child can only have one direct parent in Java.
7. But it will inherit from its parent class's parent and so on.
