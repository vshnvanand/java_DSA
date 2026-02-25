

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();

        System.out.println(dog.maxAge);
        System.out.println(Animal.maxAge);
        // System.out.println(Dog.maxAge);
        // Dog.info();
        Animal.info();
        // Animal.run();
        dog.run();
    }
}
