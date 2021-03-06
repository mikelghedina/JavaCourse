package Practica12.Service;

import Practica12.Model.Student;

import java.util.ArrayList;

public class StudentDataBase {
    ArrayList<Student> students;

    public StudentDataBase(){
        this.students = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "StudentDataBase{" +
                "students=" + students +
                '}';
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
}
