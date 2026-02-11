public class Recursion {

    public static void printNums(int num) {
        System.out.println(num);
        if(num ==0){
            System.out.println("the end");
            return;
        }
        printNums(num - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        printNums(n);
    }
}
