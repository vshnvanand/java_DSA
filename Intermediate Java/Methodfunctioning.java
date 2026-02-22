public class Methodfunctioning {
    public static void main(String[] args) {
        System.out.println(sum(3,7,10));
    }

    private static int sum(int a, int b){
        return a+b;
    }

    // Method overloading
    // Same Name
    // Same return type 
    // Just number of parameters are different 
    private static int sum(int a, int b, int c){
        return a+b+c;
    }

    private static String sum(String a, String b){
        return "hello";
    }

    // Signature
    // Same Name
    // Same number of inputs 
    // Different number of outputs 
    private static float sum(float a, float b){
        return a+b;
    }
}
