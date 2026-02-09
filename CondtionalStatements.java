import java.util.Scanner;

public class CondtionalStatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        
        if (age > 5){
            System.out.println("You are above average");
        }else if(age == 5){
            System.out.println("You are average");
        }else{
            System.out.println("Sorry bro you are below average");
        }
    }
}
