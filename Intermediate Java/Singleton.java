public class Singleton {
    
    private static Singleton obj;

    private Singleton(){

    }

    public static Singleton obj(){
        if (obj == null){
            obj = new Singleton();
        }
        return obj;
    }



}
