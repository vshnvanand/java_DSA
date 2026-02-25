public class Computer {
    
    private String brand;

    private String model;

    private OperatingSystem os;

    static class USB{
        private String type;

        public USB(String type){
            this.type = type;
        }

        public void displayInfo(){
            System.out.println("USB Type: " + type);
        }
    }

    public OperatingSystem getos(){
        return os;
    }

    public Computer(String model, String brand, String osName){
        this.model = model;
        this.brand = brand;
        this.os = new OperatingSystem(osName);
    }

    class OperatingSystem{
        private String osName;
        
        public OperatingSystem(String osName){
            this.osName = osName;
        }

        public void displayInfo(){
        System.out.println("Computer Model: " + Computer.this.model + " , os name: " +  this.osName);       
        }
    }

}
