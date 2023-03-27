package Excercise2;

public class Student {
    private String name = "John";
    private String classes = "C02";

    Student() {

    }

    void setName(String name) {
        this.name = name;
    }

    void setClasses(String classes) {
        this.classes = classes;
    }
    @Override
    public String toString() {
        return name + " " + classes;
    }
}
