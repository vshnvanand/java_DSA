## What is the difference between abstract and interface
- Both are checklist made for planning but, purpose alag alag hai 






----------------------------------------------------------------------------------------------------------------------------------------

## this vs this()
'this' in java means object reference like pointer pointing to specific point this.name = 
like name of this specific object 

this() - means constructor calling its own constructor 
class Car {

    Car() {
        this("Unknown");   // calling another constructor
    }

    Car(String model) {
        System.out.println(model);
    }
}

with this() you can do a consturctor chaining too
class Car {

    Car() {
        this("Unknown");
    }

    Car(String model) {
        this(model, 2024);
    }

    Car(String model, int year) {
        System.out.println(model + " " + year);
    }
}
This is called as self constructor chaining


## what is the use of super()
- if the parent constructor is a parameterized constructor then we need to call it bydefault it is not going to work
class Parent {
    Parent(String name) {
        System.out.println("Parent: " + name);
    }
}
class Child extends Parent {
    Child() {
        System.out.println("Child constructor");
    }
}


class Child extends Parent {
    Child(String name) {
        super(name);  // explicitly calling correct parent constructor
        System.out.println("Child constructor");
    }
}

----------------------------------------------------------------------------------------------------------------------------------------

## same class can never have super and this never parent can have this and child having super is still okay but can never have same class cuz they both are treated as starting points 

----------------------------------------------------------------------------------------------------------------------------------------

## Without constructor chaing BAD CODE
[Example hai jyada buddhi maat chala]

class BankAccount {

    String accountNumber;
    String holderName;
    double balance;

    BankAccount(String accountNumber, String holderName) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = 0;   // repeated logic
    }

    BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;   // repeated logic
        this.holderName = holderName;        // repeated logic
        this.balance = balance;
    }
}

Problem:

You repeated:
this.accountNumber = accountNumber;
this.holderName = holderName;

## With constructor chaining GOOD CODE

class BankAccount {

    String accountNumber;
    String holderName;
    double balance;

    // Main constructor (centralized logic)
    BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Secondary constructor
    BankAccount(String accountNumber, String holderName) {
        this(accountNumber, holderName, 0);  // calling main constructor
    }
}

----------------------------------------------------------------------------------------------------------------------------------------

- main
# interface vs abstract 
interface is like part of abstract like is abstract is solar system then interface is just like a planet 
The only difference is that in interface you define action/ method
but in abstract you can define instances, constructors 
Abstract is a complete structure interface is just a small part 

The problem interface solves 
1. Multiple inheritance
2. No need to storing things and deidcated structure you can pick things from different different interfaces.
3. Abstract could have concreate methods but interfaces dont have them 

- Abstract classes mein instance variables hoti hai 
or unko initize krne k liye constructor bhi chahiye hote hai 

But interfaces mein yeh nahi hoti 

----------------------------------------------------------------------------------------------------------------------------------------

## inner classes
- Nested class
-- Member inner class
-- Static Nested class
-- Local inner class
-- Anonymous Inner class

----------------------------------------------------------------------------------------------------------------------------------------

## types of static 
Static variable - There is only one copy of variable shared by all objects.
static class - 