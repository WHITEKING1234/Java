import java.util.Scanner;

abstract class iphone {
    protected String brand;
    protected String model;
    protected double year;
    protected double storage;


    public abstract void create();
    public abstract void stop();
    public void showPhone() {
        System.out.println( "Brand: " + brand);
        System.out.println( "Model: " + model);
        System.out.println( "Year: " + year);
        System.out.println( "Storage: " + storage);
    }
}

class Phone extends iphone{
    public Phone(String brand, String model, double year, double storage){
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.storage = storage;
    }

    @Override
    public void create() {
        System.out.println("Phone engine started");
    }

    @Override
    public void stop() {
        System.out.println("Phone engine stopped");
    }
}

class Realise{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your brand ");
        String a = scanner.nextLine();
        System.out.println("Enter your model ");
        String operator = scanner.nextLine();
        System.out.println("Enter your year ");
        double b = scanner.nextInt();
        System.out.println("Enter your storage ");
        double c = scanner.nextDouble();

        iphone phone = new Phone(a, operator, b, c);
        phone.create();
        phone.stop();
        phone.showPhone();
    }
}
