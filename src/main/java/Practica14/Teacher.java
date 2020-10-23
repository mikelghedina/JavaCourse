package Practica14;

public class Teacher extends Person {
    private String grau;

    public Teacher(String name, String lastName, int age, double height, double weight, String grau) {
        super(name, lastName, age, height, weight);
        this.grau = grau;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "grau='" + grau + '\'' +
                '}';
    }
    public String getGrau() {
        return grau;
    }

    public void setGrau(String grau) {
        this.grau = grau;
    }


}
