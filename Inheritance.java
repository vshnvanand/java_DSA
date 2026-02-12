class Shape {
String color;
}

class Triangle extends Shape {

}

// Single level inheritence - 1 Parent 1 child
// Multilevel inheritence - 1 parent 1 child 1 grandchild
// heirarcial inheritence - 1 parent more than 1 child
// Hybrid inheritence - all combine     

// That parent class is called as super class

public class Inheritance {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.color = "red";

    }
}
