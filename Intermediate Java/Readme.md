## Doubts

1. Abstraction vs encapsulation 
- Abstraction is like setting a structure like if it is car then it must should have a sterring wheel, 4 tyres, acclerator and brake this was its properties but in action it should increase speed decrese speed, should start should slow down should change its direction otherwise it won't be a car
The must to have properties and characterstics within a model is called Abstraction 
The must to have things is called Abstraction 
- Encapsulation is like instead of directly accessing the car we use indirect access like to rotate wheel we use sterring wheel to get the postion of wheel we use the angle to increase the speed we use pedal instead of pulling the wire. 

----------------------------------------------------------------------------------

Static Keyword:
A class can be access in 2 ways 
i) Directly import - same for all objects
ii) indirectly, inherit through an object - different for all object completly new

Best example : 
phones all phones have are completly new but there ios is same, same updates same version 

Every time you create an object:

Each object gets:
Its own copy of instance variables
Its own memory allocation

With static
There is only one copy, shared by all objects.
It belongs to the class itself.

static members are stored once per class.
So:
Instance variable → one per object
Static variable → one per class

## Static method
can't use this 
Why this is actually a  pointer pointing the parameter of that object specially this this object but for static there is no particular object it is same for everyone



class A {
    static void show() {
        System.out.println("A");
    }
}

class B extends A {
    static void show() {
        System.out.println("B");
    }
}
A obj = new B();
obj.show();

Result - A
Because static method depends on reference type.
Not object type.


Feature           Static Block                              Parameterized Constructor
Runs when?        Class loading                             Object creation
How many times?   Once per class                            Every object
Purpose           Initialize class-level data               Initialize object-level data
Access            Can only access static members directly   Can access both static & instance
Belongs to        Class                                     Object

Static block → prepares the environment
Constructor → prepares the object
Static runs once. Constructor runs twice.

---------------------------------------------------------------------------------------------

## Access Modifiers:
- Public : Khulli kitab
- Private : Same class only can't access to other class not even in the same package, not even subclass : Class limited
- Default : Same class, same package, and subclass if it is made in the same package not in other packages : Package limited
- Protected :  Everywhere except different package without inheriting it you can't access it any subclass in different package which inherits it also can access

Public < Protected < Default < Private - Securities 

Subclass means - inherit class / child class the class which uses extends, which inherit other class



## Why having a class abstract is also manditory if there is even one abstract method

-You are saying the class has a method, But you are not providing its implementation, So the class is incomplete


---------------------------------------------------------------------------------------------
## Constructor
- Its is initailize as an object is created like for every new object a new constructor but static block is initialized when a class is created like every new object same class

class Student {
    String name;

    Student(String name) {
        this.name = name;
    }
}
Student s = new Student("Rahul"); // We call this parameterized constructor where we need to create an object with some input 

We dont declare an object when there is no need to having a started value

Default constructor
class Car {
}

No argument constructor
class Car {
    Car() {
        System.out.println("Car created");
    }
}

Parameterized constructor
class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

Copy constructor
class Student {
    String name;

    Student(Student s) {
        this.name = s.name;
    }
}




-- Constructor Overloading

class Car {
    Car() {
        System.out.println("No data");
    }

    Car(String model) {
        System.out.println("Model: " + model);
    }
}
>> Same as method overloading

-- Constructor chaining

class Student {
    String name;
    int age;

    Student(String name) {
        this(name, 18);
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

>> this() must be first line.

-- Super constructor

class Animal {
    Animal() {
        System.out.println("Animal created");
    }
}

class Dog extends Animal {
    Dog() {
        super();  // calls parent constructor
        System.out.println("Dog created");
    }
}

Can Constructor Be static?
- No.
Because constructor initializes object.
Static belongs to class.

Can Constructor Be private?
Yes.

Used in:
Singleton pattern
Factory methods

Important Interview Points
✔ Constructor is not inherited
✔ Constructor cannot be overridden
✔ Constructor can be overloaded
✔ If you write parameterized constructor, default is not auto-created
✔ this() and super() must be first statement

---------------------------------------------------------------------------------------------

## Copy constructor 

- Shallow copy constructor
- Deep copy constructor 


---------------------------------------------------------------------------------------------

# What is an Abstract Method? 
A method declared but not implemented 
That means it has no body 
Its is just like a rought sketch like notind down list of requirements before starting a project like a planning


# Why abstract method means abstract class?
Because without method what is the use of class 
and what will the object does when it is called


- Bhai agar tu abstract k aandar logic likh raha hai tho tu bewakoof hai kyu likh waha raha hai wahi baat gadhe k race mein kutte tho dhoda raha hai kyu? jab uska purpose waha hai he nahi 

- What If Abstract Method Didn’t Exist?
Without abstract methods:
You could forget to implement important behavior in subclass.
Abstract method forces subclass to implement it.
It enforces a contract.

- Why Not Just Use a Normal Class?
Then:
Subclass can override it — but it is optional.
With abstract:
Override becomes mandatory. And it is the purpose of the abstract to override it like a check list where you mention what to do, not how to do 

- Why Can’t We Create Object of Abstract Class?
Because we dont know the behaviour of the object 
Compiler will say krna kya hai iska hai kya yeh kuch tho batao uss hisab se banaunaga na bhai