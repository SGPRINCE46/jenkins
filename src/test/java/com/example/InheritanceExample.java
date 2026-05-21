// Parent class
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

// Main class
public class InheritanceExample {
    public static void main(String[] args) {

        Dog d = new Dog();

        // Calling parent class method
        d.sound();

        // Calling child class method
        d.bark();
    }
}
