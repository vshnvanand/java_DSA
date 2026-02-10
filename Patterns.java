import java.util.*;

public class Patterns {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        // Rectangle and Square Pattern 
        // for(int i = 0; i<num; i++){
        //     int a = 0;
        //     while (a < num){
        //         System.out.print("*");
        //         a += 1;
        //     }
        //     System.out.println("");
        // }

        // Hollow Rectangle pattern
        // for (int rows= 1; rows<=num ; rows++){
        //     for (int cols = 1; cols<=num; cols++){
        //         if (rows != 1 & rows != num & cols != 1 &cols != num){
        //             System.out.print(" ");
        //         }else{
        //             System.out.print("*");
        //         }
        //     }
        //     System.out.println("");
        // }

        // Upward half pyramid
        // for (int rows=1; rows<=num; rows++){
        //     for (int cols = 1; cols<=rows; cols++){
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }

        // Inverted lower half pyramid
        // for (int rows=num; rows>=1; rows--){
        //     for (int cols=rows; cols>=1; cols--){
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }

        // Reverse upward half pyramid 
        // for (int row = 1; row <= num; row++){
        //     for(int col = 1; col <= num; col++){
        //         if (num - col >= row){
        //             System.out.print(" ");
        //         }else{
        //             System.out.print("*");
        //         }
        //     }
        //     System.out.println("");
        // }
        
        // Number pyramid
        // int digit = 1;
        // for(int rows=1; rows<=num; rows++){
        //     for (int cols=1; cols<=rows; cols++){
        //         System.out.print(digit + " ");
        //         digit++;
        //     }
        //     System.out.println("");
        // }

        // 1, 0 pyramid pattern
        for (int rows = 1; rows <= num; rows++){
            for (int cols = 1; cols <= rows; cols++){
                if ((rows + cols) % 2 == 0){
                    System.out.print(1 + " ");
                }else{
                    System.out.print(0 +" ");
                }
            }
            System.out.println("");
        }

    }
}
