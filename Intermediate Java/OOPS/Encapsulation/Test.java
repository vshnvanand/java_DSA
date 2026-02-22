public class Test{
    public static void main(String[] args) {
        Car car = new Car();
        car.setBrand("TATA");
        car.setModel("Nano");
        car.setColor("Silver");
        car.setYear(2004);
        car.setSpeed(40);

        car.accelerate(10);
        System.out.println(car.getSpeed());
    }
}