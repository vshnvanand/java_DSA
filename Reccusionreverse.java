public class Reccusionreverse {
    
    public static void reverse(String args, int index) {
        
        if (index == 0){
            System.out.println(args.charAt(index));
            return ;
        }

        System.out.println(args.charAt(index));
        reverse(args, index-1);
    }
    
    public static void main(String[] args) {
        String word = "hello";
        reverse(word, word.length()-1);
    }
}
