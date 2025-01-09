abstract class Vehicle {
    protected  String brand;
    protected  String model;
    protected  int year;

    public abstract void drive();
    public abstract void stop();
    public void showCar() {
        System.out.println( "Brand: " + brand);
        System.out.println( "Model: " + model);
        System.out.println( "Year: " + year);
    }
}

class Car extends Vehicle {
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;

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

class Mains {
    public static void main(String[] args) {
        Vehicle car = new Car("BMW", "BMW", 2020);
        car.drive();
        car.stop();
        car.showCar();
    }
}