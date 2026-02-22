public class Anyinput {
    public static void main(String[] args) {
        Result(2,3,4);
    }   
    
    public static void Result(int ...a){
        for(int i : a){
            // System.out.println(a);
            System.out.println(i);
        }
    }
}
