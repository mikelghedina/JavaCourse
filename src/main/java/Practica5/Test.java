package Practica5;

public class Test {
    public static void main(String[] args) {
        Person andrea = new Person("joan", 30);

        andrea.setHeight(5.5);
        andrea.setWeight(59);
        andrea.setAge(20);
        andrea.setName("Andrea");
        System.out.println(andrea.getAge());
        andrea.becomeOlder(5);
        System.out.println(andrea.getAge());
        andrea.changeAttributesPerson("blue","blue",5,true );
        System.out.println(andrea);
        andrea.printPerson("blue", "blonde", true);
        andrea.printPerson("blue", "blonde", false);

    }
}
