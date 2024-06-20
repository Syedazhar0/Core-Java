package oops;

// Defining class A
class A {
    // Method in class A
    public void happy_Sad_nervous() {
        // Printing a message
        System.out.println("Hey im supper im soo happy");
    }
}

// Defining class B, which extends class A
class B extends A {
    // Overriding the happy_Sad_nervous() method of class A
    @Override
    public void happy_Sad_nervous() {
        // Calling the overridden method of class A using super
        super.happy_Sad_nervous();
        // Printing a message specific to class B
        System.out.println("Hey im Sub 1 im soo Sad");
    }
}

// Defining class C, which extends class A
class C extends A {
    // Overriding the happy_Sad_nervous() method of class A
    @Override
    public void happy_Sad_nervous() {
        // Calling the overridden method of class A using super
        super.happy_Sad_nervous();
        // Printing a message specific to class C
        System.out.println("Hey im Sub 2 im soo nervous");
    }
}

// Defining class D, which extends class A
class D extends A {
    // Overriding the happy_Sad_nervous() method of class A
    @Override
    public void happy_Sad_nervous() {
        // Calling the overridden method of class A using super
        super.happy_Sad_nervous();
        // Printing a message specific to class D
        System.out.println("Hey im Sub 3 im feeling content");
    }
}

// Defining class E, which extends class B
class E extends B {
    // Overriding the happy_Sad_nervous() method of class B
    @Override
    public void happy_Sad_nervous() {
        // Calling the overridden method of class B using super
        super.happy_Sad_nervous();
        // Printing a message specific to class E
        System.out.println("Hey im Sub 4 im excited");
    }
}

// Main class
public class OverRiding {
    // Main method, entry point of the program
    public static void main(String[] args) {
        // Creating instances of classes
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();
        // Calling the overridden methods
        b.happy_Sad_nervous();
        c.happy_Sad_nervous();
        d.happy_Sad_nervous();
        e.happy_Sad_nervous();
    }
}
