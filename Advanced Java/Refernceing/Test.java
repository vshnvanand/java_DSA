public class Test {
    public static void main(String[] args) {
        // Student s1 = new Student();
        // s1.id = 1;
        // fun(s1);
        // System.out.println(s1.id);
        Integer b = 1;
        fun(b);
        System.out.println(b);
    }   
    public static void fun(Integer b) {
    // public static void fun(Student a){
        // Student s2 = new Student();
        // s2.id = 2;
        // a = s2;
        // a.id = 2;
        b = 3;
    }
    
}

public class Student{
    public int id;
}
