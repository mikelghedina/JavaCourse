package Practica10;

public class Person {
    private String name;
    private String lastName;
    private int age;

    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;

    }

    public String printPerson(){
        return this.name + " " + this.lastName + " whose age is "+ this.age+"\n";
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
