public class Builderstrings {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        // System.out.println(sb);

        // char at index 0
        // System.out.println(sb.charAt(0));
        
        // replace not setting only works for an existing ones char at index
        // sb.setCharAt(3,'i');
        // System.out.println(sb);

        // insert char
        // sb.insert(0, 'S');
        // System.out.println(sb);

        // delete char
        // sb.delete(1, 2);
        // System.out.println(sb);

        // append adding at end
        // sb.append(" sir");
        // System.out.println(sb);

        // length of a string 
        // System.out.println(sb.length());

        // reversing a string 
        // StringBuilder sb1 = new StringBuilder();
        // for (int i=sb.length()-1; i >= 0; i--){
        //     sb1.append(sb.charAt(i));
        // }
        // System.out.println(sb1);
        // System.out.println(new StringBuilder(sb).reverse());
        sb.reverse();
        System.out.println(sb);


    }
}
