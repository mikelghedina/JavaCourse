package Practica10;

import java.util.ArrayList;

public class Bird {
    private String name;
    private String latinName;
    private int observations;
    private ArrayList<Person> personsWhoObserved;

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.personsWhoObserved = new ArrayList<>();
    }

    public void printBird(){
        System.out.println(this.name + "("+ this.latinName+ "):"+ this.observations + " observations by: "+ printPersons());
    }

    public String printPersons(){
        String personsPrinted = "";
        for (Person person: personsWhoObserved) {
            personsPrinted = person.printPerson();
        }
        return personsPrinted;
    }
    @Override
    public String toString() {
        return "Bird{" +
                "name='" + name + '\'' +
                ", latinName='" + latinName + '\'' +
                '}';
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLatinName() {
        return latinName;
    }

    public void setLatinName(String latinName) {
        this.latinName = latinName;
    }

    public int getObservations() {
        return observations;
    }

    public void setObservations(int observations, String name, String lastName, int age) {
        this.observations = observations;
        this.personsWhoObserved.add(new Person(name,lastName, age));

    }
}
