package Day4_OOP;

public class MyClass {
    // Instance member
     /*
    Instance Members: These are members (variables, methods, and blocks) that belong to an instance of a class.
    Each instance of the class has its own copy of these members.
    They are non-static members and are declared without the static keyword.
    They can only be accessed through an object of the class.
     */
    int instanceVar;

    // Static member
/*
    Static Members: These are members (variables, methods, and blocks) that belong to the class itself.
    They are shared among all instances of the class.
    They are declared with the static keyword.
    They can be accessed directly through the class name.
    Utility Functions: Static methods are often used to create utility functions that don't depend on the state of an object.
     For example,
     the Math class in Java is full of static methods
 */
    static int staticVar;

    // Instance method
    void instanceMethod() {
        System.out.println("This is an instance method");
    }

    // Static method
    static void staticMethod() {
        System.out.println("This is a static method");
    }
}


