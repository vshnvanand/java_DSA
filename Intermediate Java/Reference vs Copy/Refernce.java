public class Refernce {
    public static void main(String[] args) {
        Cat a = new Cat();
        a.name = "bob";

        System.out.println(makeCatNameUppercase(a).name);
        System.out.println(a.name);
    }

    public static Cat makeCatNameUppercase( Cat cat){
        cat.name = cat.name.toUpperCase();
        return cat;
    }
}
