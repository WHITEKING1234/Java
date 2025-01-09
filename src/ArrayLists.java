import java.util.Scanner;
import java.util.ArrayList;

public class ArrayLists {
private String model;
public ArrayLists(String model) {
    this.model = model;
}

public String getModel() {
    return model;
}
}

 class Main {
public static void main(String[] args) {
    ArrayLists car = new ArrayLists("Toyota");
    System.out.println("Model: " + car.getModel());

}
}

