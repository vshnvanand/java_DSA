
import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        for(int i = 1; i<input+1; i++){
            for(int j = 1; j<= ((2*i)-1) ; j++){
                if(j%2 == 0){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
