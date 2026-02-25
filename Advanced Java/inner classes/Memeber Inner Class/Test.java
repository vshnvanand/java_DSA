public class Test{
    
    public static void main(String[] args) {
        Car car = new Car("Scorpio N");
        Car.Engine engine = car.new Engine();
        // this car.new is actually a new obj of the car class that is why car.new otherwise new 
        engine.start();
        engine.stop();
    }

}