import java.util.*;

public class Function {

    // public static String printName(String args){
    //     System.out.println(args);
    //     return args;
    // }

    public static int sum(int a, int b){
        return a + b ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // printName(name);

        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(sum(a,b));
    }
}
