package Practica12.Service;

import Practica12.Model.Student;
import Practica12.Model.StudentDataBase;

public class StudentUtils {
    public static boolean isAcceptedPassword(StudentDataBase studentDataBase, String password){
        for (Student student: studentDataBase.getStudents()) {
            if(student.getPassword().equals(password)){
                return true;
            }
        }
        return false;
    }
    public static boolean isAcceptedUserName(StudentDataBase studentDataBase, String username){
        for (Student student: studentDataBase.getStudents()) {
            if(student.getUserName().equals(username)){
                return true;
            }
        }
        return false;
    }
    public static void printStudentInfo(StudentDataBase studentDataBase, String username){
        for (Student student: studentDataBase.getStudents()) {
            if(username.equals(student.getUserName())){
                student.printFullStudentInfo();
            }
        }
    }
}
