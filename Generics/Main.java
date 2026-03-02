import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        // int[] arr = new int[5]; // Here we need to define size of the array
        // ArrayList<String> list = new ArrayList<>(); // But here there is no need to declare the size of the array it is dynamic in nature, one more thing here you can add multiple things of different datatypes like you can add int, then string, then char like that 

        // list.add("Hello");
        // list.add("World");



        // System.out.println(list.get(0));
        // System.out.println(list.get(1));
        

        // Box<Integer> box = new Box<>();
        // box.setBoxValue(5);
        // System.out.println(box.getBoxValue());


        // Pair<String, Integer> pair = new Pair<>("Naman", 30);
        // System.out.println(pair.getKey());
        // System.out.println(pair.getValue());
        
        // StringContainer<String> str = new StringContainer<>();
        // str.get();

        Box<Integer> box = new Box<>();
        box.getBoxValue();
    }

}
