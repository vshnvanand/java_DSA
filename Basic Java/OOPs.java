class Student{
    String name;
    int age;

    // method overflow
    // compile time polymorphism                         
    public void printInfo(String name) {
        System.out.println(name);
    }

    public void printInfo(int age) {
        System.out.println(age);
    }

    public void printInfo(int age, String name){
        System.out.println(this.name + " of " + this.age);
    }

    // non parameterized constructor
    // Student(){
    //     this.name = s2.name;
    //     this.age = s2.age;
    // }
    
    // parameterized constructor
    // Student(Student s2){
    //     this.name = s2.name;
    //     this.age = s2.age;
    // }

    // copied constructor
    // Student(){

    // }
}

public class OOPs {
    public static void main(String[] args) {
        // Pen pen1 = new Pen();
        // pen1.setColor("red");
        // pen1.brand = "cello";
        // pen1.write();

        // Pen pen2 = new Pen();
        // pen2.setColor("orange");
        // pen2.printColor();


        Student kid = new Student();
        kid.name = "Sheetal";
        kid.age = 13;

        kid.printInfo(kid.age, kid.name);
    }   
}
