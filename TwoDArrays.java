
import java.util.Scanner;

public class TwoDArrays {
    public static void main(String[] args) {
        int[][] array2 = new int[5][3];
        Scanner sc = new Scanner(System.in);

        for (int rows=0; rows<=4; rows++){
            for(int cols = 0; cols <= 2; cols++){
                array2[rows][cols] = sc.nextInt();
            }
        }


        for (int rows=0; rows<=4; rows++){
            for(int cols = 0; cols <= 2; cols++){
                System.out.print(array2[rows][cols] + " ");
            }
            System.out.println("");
        }
    }
}
