package Practica5;


public class Person {

    public String name;
    public int age;
    public double weight;
    public double height;
    public String eyesColor;
    public String hairColor;
    public int manyBrothers;
    public boolean isPretty;


    public void person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void person(String name, int age, double weight, double height){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }
    public void changeAttributesPerson(String eyesColor, String hairColor, int manyBrothers, boolean isPretty){
        this.eyesColor = eyesColor;
        this.hairColor = hairColor;
        this.manyBrothers = manyBrothers;
        this.isPretty = isPretty;
    }
    public void changeBrothersAndPretty(int manyBrothers, boolean isPretty){
        this.manyBrothers = manyBrothers;
        this.isPretty = isPretty;
    }
    public void printPerson(){
        System.out.println(getName()+ " is " + getAge() + " and has a " + bodyMassIndex() + " IMC.");
    }
    public void printPerson(String eyesColor, String hairColor, boolean isPretty){
        if(isPretty){
            System.out.println(getName()+ " is " + getAge() + " and has a " + bodyMassIndex() + " IMC. "+"\n"+ getName() + " also is " + hairColor+ " and has " + eyesColor +" eyes.");
        }else{
            System.out.println("That's a lie.");
        }
    }
    public void becomeOlder(int muchBecomeOlder, int heightNow, int weightNow ){
        this.age = this.getAge() + muchBecomeOlder;
        this.height = this.getHeight() + heightNow;
        this.weight = this.getWeight() + weightNow;
    }
    public void becomeOlder(int howMuchBecomeOlder){
        this.age = this.getAge() + howMuchBecomeOlder;
    }
    public boolean isAdult(){
        return getAge() >= 18;
    }
    public double bodyMassIndex(){
        return this.getWeight()/this.getHeight();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                ", eyesColor='" + eyesColor + '\'' +
                ", hairColor='" + hairColor + '\'' +
                ", manyBrothers=" + manyBrothers +
                ", isPretty=" + isPretty +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getEyesColor() {
        return eyesColor;
    }

    public void setEyesColor(String eyesColor) {
        this.eyesColor = eyesColor;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public int getManyBrothers() {
        return manyBrothers;
    }

    public void setManyBrothers(int manyBrothers) {
        this.manyBrothers = manyBrothers;
    }

    public boolean isPretty() {
        return isPretty;
    }

    public void setPretty(boolean pretty) {
        isPretty = pretty;
    }
}
