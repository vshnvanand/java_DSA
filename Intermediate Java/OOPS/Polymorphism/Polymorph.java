public class Polymorph {
    // Poly morp is just 2 words 
    // a. Poly - multiple
    // b. morph - copy 

    // multiple copy of same thing 
    // same as method overloading and method overriding 
    // method overloading - compile time error // same name
    // method overridding [inhertance]- runtime detection // 

    Dog rat = new Dog();
    rat.makeSound();
    // You see reference class is different and the object class is different 

    public static void main(String[] args) {
        
        Animal dog = new Dog(); // upcasting
        dog.sayhello();

        Dog myDog = (Dog) dog; // downcast

        // poly morph is just you for someone you are brother, for someone you are son, for someone you are father, for someone you are student one man but different roles 
        
        // method overloading - Same name, Different parameters, Same class, Compile Time, No inheritance needed, Different return type, 
        // method overriding - Same name, Same parameters, Different class, Runtime, Inheritance needed otherwise it how it will be overriding, must return the same type 


        // Upcasting - When child class refers to the parent class is called upcasting 
        // Downcasting - When your parent class refers to the child class is called downcasting 
    }
}
