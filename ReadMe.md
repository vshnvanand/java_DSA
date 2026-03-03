# Main Topics 

- Type casting
- Polymorphism
- Abstraction
- this. vs this()
- constructors and types, constructor chaining
- final, static
- public, private, protected, default // Access Modifier
- Interfaces
- Method overriding vs method overloading
- Error handling : Types of Error 
- Inner classes and types of inner classes
- Wrappers & Primitives
- super()
- Math. other general classes
- Enums
- Generics
- Type Safety issue 
- Collections and Framework
- String vs StringBuilder vs StringBuffer
- Java Multithreading, Sync, Locks
- Volatile vs Atomic

--------------------------------------------------------------------------------
# Variables 

Variables are containers to store data in memory. Each variable has a name, type and value. It is the basic unit of storage in a program. Java has 4 types of variables.

- Local Variables: Declared inside a method, constructor, or block. Accessible only within that block.
- Instance Variables: Declared inside a class but outside any method. Each object of the class has its own copy.
- Static Variables: Declared with the static keyword inside a class. Shared by all objects of the class.
- Final Variables: Declared with final keyword. Value cannot be changed once assigned.

public class Demo {
    public static void main(String[] args) {
        int x = 10;
        {
            int x = 20;
            System.out.println(x);
        }
    }
}
This is called variable overshadowing and can cause and error

----------------------------------------------------------------------------------------
# Methods
Works on method call stack `LIFO`

- Predefined Method
- User-defined Method
    - Instance Methods
    - Static Methods

1. Method Overloading 
2. Method Overriding 

----------------------------------------------------------------------------------------
- hashcode : it returns a unique integer value representing objects memory address. 
----------------------------------------------------------------------------------------

static method vs instance method 
## static method
- Any method that belongs to a class is called static method 
- No object is required to interact with it 
- Since there is no object differentiation there is no need to using this keyword

## Instance method 
- Are object method can only be used when there is a object of that class
- common for all the objects of the that class not like other variables are new but not static

----------------------------------------------------------------------------------------
# Access Modifier

Define the boundaries of the methods, class and variables
Public - 
Protected - 
Private - Only accessable in that particular class // principle of encapsulation
Default - Only same package

