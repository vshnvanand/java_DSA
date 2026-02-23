public class Student {
    
    private String name;
    private int age;
    private int id;
    private int marks;
    
    // overload constructor
    // public Student(){  // Customed constructor there is no return type of the constructor and the name of the constructor should be same as the name of the class 

    //     this.age = 17; // this type of constructor is called overloaded constructor where you overload the default values

    // }

    // parameterized constructor 
    // public Student(String name, int id, int age, int marks){
    //     this.name = name;
    //     this.age = age;
    //     this.id = id;
    //     this.marks = marks;
    // }

    public Student(int age){
        this.age = age;
    }

    public Student(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getMarks(){
        return this.marks;
    }

    public void setMarks(int marks){
        this.marks = marks;
    }
}
