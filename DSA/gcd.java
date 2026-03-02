
import java.util.Scanner;

public class gcd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = hcf(a,b);
        System.out.println(x);

    }

    public static int hcf(int a, int b){
        return b == 0 ? a : hcf(b,a%b);
    }
}