public class MyCar {
    public static void main(String[] args) {
        // Create a new Car class.
        Car Toyota = new Car("red");
        Toyota.setSpeed(200);
        Toyota.setMileage(1345);

        // Create a new Car class.
        Car Honda = new Car("blue");
        Honda.setSpeed(300);
        Honda.setMileage(8987);

        // Print the details of the cars.
        System.out.println("Toyota colors: " + Toyota.getColor() + " speed: " + Toyota.getSpeed() + " mileage: " + Toyota.getMileage());
        System.out.println("Honda colors: " + Honda.getColor() + " speed: " + Honda.getSpeed() + " mileage: " + Honda.getMileage());
    }
}
