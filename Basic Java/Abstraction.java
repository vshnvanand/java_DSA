abstract class Animal {
    abstract void walk(); // @ wala in python
    Animal(){
        System.out.println("class Animal is called");
    }
}

class Horse extends Animal {
    // constructor chaining
    Horse() {
        System.out.println("Kyu padh gayi na meri jarurat");
    } 

    public void walk() {
        System.out.println("This animal walks 4 legs");
    }
}

class Chicken extends Animal {
    public void walk() {
        System.out.println("This animal walks 2 legs");
    }
}

public class Abstraction{
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
        
        // abstract error
        // Animal dog = new Animal();
        // dog.walk();
    }
}