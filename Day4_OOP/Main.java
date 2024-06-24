package Day4_OOP;

import Day4_OOP.DataEncapsulation.Person;
import Day4_OOP.InheritancePractise.*;

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
        Person person = new Person();
        person.setName("John");
        person.setAge(18);
        System.out.println(person);
        System.out.println(person.getName() + " is " + person.getAge() + " years old");

        Animal animal = new Animal();
        animal.makeSound();
        Dog dog = new Dog();
        dog.makeSound();

        Shape shape = new Shape();
        shape.draw();
        Circle circle = new Circle();
        circle.draw();
        Square square = new Square();
        square.draw();

    }
}