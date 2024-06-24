package Day4_OOP;

public class Car {
    private String model;
    private String brand;
    private String year;
    public Car(String model, String brand, String year){
        this.model = model;
        this.brand = brand;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" + "model='" + model + '\'' + ", brand='" + brand + '\'' + ", year='" + year + '\'' + '}';
    }
}
