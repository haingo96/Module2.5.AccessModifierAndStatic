package Practice1;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change();

        Student student1 = new Student();
        student1.setName("Hai");
        student1.setRollno(123);

        student1.display();
    }
}
