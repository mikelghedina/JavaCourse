package Practica12;

public class Person {
    private String name;
    private String lastName;
    private double weight;
    private double height;
    private Date birthDate;
    private String ID;

    public Person(String name, String lastName, double weight, double height, Date birthDate) {
        this.name = name;
        this.lastName = lastName;
        this.weight = weight;
        this.height = height;
        this.birthDate = birthDate;
    }

    public Person(String name, String lastName, double weight, double height, Date birthDate, String ID) {
        this.name = name;
        this.lastName = lastName;
        this.weight = weight;
        this.height = height;
        this.birthDate = birthDate;
        this.ID = ID;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
}
