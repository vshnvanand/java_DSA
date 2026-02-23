public class Test {

    public static void main(String[] args) {
        // Student student1 = new Student(); // default constructor - doesnt take any parameter and we also dont write them explicitly they are by default as the name says
        
        // Student student1 = new Student("Rahul", 34549, 19, 120); // parametized constructor  
        
        // Student student1 = new Student("Rahul");
        // Student student1 = new Student(17); // overloaded parameterized constructor

        
        System.out.println(student1.getName());
        System.out.println(student1.getId());
        System.out.println(student1.getAge());
        System.out.println(student1.getMarks());
    }
}
