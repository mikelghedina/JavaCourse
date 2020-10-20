package Practica12.Service;

import Practica12.Model.Date;
import Practica12.Model.Student;

import java.util.ArrayList;

public class InitialStudents {


     public static ArrayList<Student> studentsList(){
         ArrayList<Student> students = new ArrayList<>();
         students.add(new Student("Miguel Angel", "Arregui", 85.5, 1.85,
                 new Date(20,6,1996),"48043198Q", "migangarr", "migangarr480"));

         students.add(new Student("Andrea", "Toronto", 60, 1.68,
                 new Date(30,12,1997),"35689574K","andtoro","andtoro356"));

         students.add(new Student("Laia", "Ausio", 58, 1.60,
                 new Date(12,2,1991),"75689525E", "laiaus", "laiaus756"));
         return students;
     }
}
