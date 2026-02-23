public class Animal {

    private String name;
    private int age;

    public Animal(){
        System.out.println("Constructor called from Animal");
    }

    public String getName(){
        System.out.println("Name is getting from the Animal lib");
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

    public void eat(){
        System.out.println("This animal eats food");
    }

    public void sayHello(){

    }
    
}
