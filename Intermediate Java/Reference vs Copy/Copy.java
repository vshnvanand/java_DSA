public class Copy {
    
    // pass by value 
    
    public static void main(String[] args) {
        String str = "vipul";
        int a = 10;
        System.out.println(upgrade(a));
        System.out.println(a);
        System.out.println(upper(str));
        System.out.println(str);
        
    }

    public static String upper(String str){
        return str.toUpperCase();
    }

    public static int upgrade(int i){
        return i+10;
    }
}
