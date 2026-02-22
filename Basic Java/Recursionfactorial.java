import java.util.Scanner;

public class Recursionfactorial {
    
    public static int Fact(int num){
        if(num ==0 || num == 1){
            return 1;
        }else if(num < 0){
            System.out.println("Invalid Number");
            return 0;
        }else{
            return num * Fact(num-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(Fact(num));
    }
}
