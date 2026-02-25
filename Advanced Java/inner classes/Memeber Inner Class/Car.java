public class Car{
    private String model;
    private boolean isEngineOn;

    public Car(String model){
        this.model = model;
        this.isEngineOn = false;
    }

    // This class will behave as the member of the this parent class
    public class Engine{

        public void start(){
            if (!isEngineOn){
                System.out.println(model + " Engine is started");
            }else{
                System.out.println("Engine is running");
            }
        }

        public void stop(){
            if(!isEngineOn){
                System.out.println(model + " Engine is stopped");
            }else{
                System.out.println("Engine is already shutted");
            }

        }
    }

    public boolean isEngineOn(){
        return isEngineOn;
    }

    public void setEngineOn(boolean engineOn){
        this.isEngineOn = engineOn;
    }
}