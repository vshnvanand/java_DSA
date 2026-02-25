public class Dog implements Animal {
    

    @Override
    public void eat(){
        System.out.println("Dog is eating...");
    }

    @Override
    public void sleep(){
        System.out.println("Dog is sleeping...");
    }

    @Override
    public void runMethod(){
        System.out.println("Running");
    }
    

}
