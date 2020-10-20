package Practica12;

public class Student extends Person{

    private String userName;
    private String password;

    public Student(String name, String lastName, double weight, double height, Date birthDate, String ID) {
        super(name, lastName, weight, height, birthDate, ID);
    }
    public Student(String name, String lastName, double weight, double height, Date birthDate, String ID, String username, String password) {
        super(name, lastName, weight, height, birthDate, ID);
        this.userName = username;
        this.password = password;

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

    public void printFullStudentInfo(){
        System.out.println(super.toString());
        System.out.println("User: "+getUserName());
        System.out.println("Pass: "+getPassword());

    }
    @Override
    public String toString() {
        return "Student{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
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
