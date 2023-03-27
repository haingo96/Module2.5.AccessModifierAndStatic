package Practice1;

public class Student {
    private int rollno;

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private static String college = "BBDIT";

    static void change() {
        college = "Codegym";
    }

    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}
