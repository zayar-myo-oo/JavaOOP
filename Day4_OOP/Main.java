package Day4_OOP;
public class Main {
    public static void main(String[] args) {
        // Accessing static member
        MyClass.staticVar = 10;
        MyClass.staticMethod();

        // Accessing instance member
        MyClass myObject = new MyClass();
        myObject.instanceVar = 20;
        myObject.instanceMethod();
        Counter.increasementCount();
        Counter.increasementCount();
        Counter.increasementCount();
        Counter count =new Counter();
        count.increasementCount();
        count.increasementCount();
        Counter count2 =new Counter();
        count2.increasementCount();
        count2.increasementCount();
    }
}