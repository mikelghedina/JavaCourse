package Practica12;

public class Student extends Person{

    private String userName;
    private String password;

    public Student(String name, String lastName, double weight, double height, Date birthDate) {
        super(name, lastName, weight, height, birthDate);
    }

    public boolean isLegalAge(){
        if((Date.calculateAge(getBirthDate().getYear()))>=18){
            return true;
        }else{
            return false;
        }
    }
    public void createFullCredentials(){
        setUserName();
        setPassword();
        System.out.println(getUserName());
        System.out.println(getPassword());
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName() {
        this.userName = getName().substring(0,3)+ getLastName().substring(0,3);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword() {
        this.password = getName().substring(0,3)+getLastName().substring(0,3)+getID().substring(0,3);
    }
}
