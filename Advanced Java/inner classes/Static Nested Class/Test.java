public class Test {
    public static void main(String[] args) {
        
        Computer computer = new Computer("Xps", "Dell","apple");

        computer.getos().displayInfo();

        Computer.USB usb = new Computer.USB("TYPE-C");
        usb.displayInfo();
    }

}
