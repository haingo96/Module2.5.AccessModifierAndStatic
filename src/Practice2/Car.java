package Practice2;

public class Car {
    private String brand;
    private int manufacturedYear;
    private String type;

    public Car(String brand, int manufacturedYear, String type) {
        this.brand = brand;
        this.manufacturedYear = manufacturedYear;
        this.type = type;
        count++;
    }

    public Car() {
        count++;
    }

    protected static int count;
}
