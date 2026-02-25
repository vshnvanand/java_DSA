public interface Animal{
    
    public abstract void eat();

    void sleep();
    void runMethod();

    int maxAge = 1;
    // public static final int maxAge = 1; // This is same as the above one 

    static void information(){
        System.out.println("THis is an Animal interface");
    }

    public static void info(){
        System.out.println("THis is an Animal interface");
    }
    // why no static will cause an error bcus 
    // no static 

    public default void run(){
        this.eat();
        System.out.println("Animal is running");
    }

}