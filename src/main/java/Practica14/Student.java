package Practica14;

public class Student extends Person {
    private int curs;

    public Student(String name, String lastName, int age, double height, double weight) {
        super(name, lastName, age, height, weight);
    }

    @Override
    public String toString() {
        return "Student{" +
                "curs=" + curs +
                '}';
    }

    public int getCurs() {
        return curs;
    }

    public void setCurs(int curs) {
        this.curs = curs;
    }
}
