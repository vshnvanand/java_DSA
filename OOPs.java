class Pen{
    private String color;
    String brand;

    public void write(){
        System.out.println("Writing something");
    }

    public void printColor(){
        System.out.println(this.color);
    }

    public void setColor(String color){
        this.color = color;
    }
}

public class OOPs {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.setColor("red");
        pen1.brand = "cello";
        pen1.write();


        Pen pen2 = new Pen();
        pen2.setColor("orange");
        pen2.printColor();
    }    
}
