public class GenricClass {
    
    public <T extends Number> GenericClass(T value){
        // Generic Constructor
    }

    public <T> void someValue(T something){
        // Generic method 
        // Remember Generic method doesnt return anything kyu return krna he hota tho seedha datatype use krta na generic kyu use krta 
    }


    public static void main(String[] args) {
        GenericClass gc = new GenericClass("Hello");
        System.out.printf("The real formal", gc);
    }
}
