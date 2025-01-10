import java.util.Scanner;

abstract class Vehicle2 {
    protected String brand;
    protected String model;
    protected double year;
    protected double probeg;


    public abstract void drive();
    public abstract void stop();
    public void showCar() {
        System.out.println( "Brand: " + brand);
        System.out.println( "Model: " + model);
        System.out.println( "Year: " + year);
        System.out.println( "Probeg: " + probeg);
    }
}

class Car2 extends Vehicle2 {
    public Car2(String brand, String model, double year, double probeg) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.probeg = probeg;
        }
    @Override
    public void drive() {
        System.out.println("Car engine started");
    }

    @Override
    public void stop() {
        System.out.println("Car engine stopped");
    }
}

class Mains2 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter your brand ");
    String a = scanner.next();
    System.out.println("Enter your model ");
    String operator = scanner.next();
    System.out.println("Enter your year ");
    double b = scanner.nextDouble();
    System.out.println("Enter your probeg ");
    double c = scanner.nextDouble();

    Vehicle2 car = new Car2(a, operator, b, c);
    car.drive();
    car.stop();
    car.showCar();
    }
}