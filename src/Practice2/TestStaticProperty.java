package Practice2;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", 2017, "sedan");
        Car car2 = new Car();

        System.out.println(Car.count);
    }
}
