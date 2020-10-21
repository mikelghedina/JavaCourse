package Practica12.View;


import Practica12.Controller.OptionsMenu;
import Practica12.Utils.InitialStudents;

public class Test {

    public static void main(String[] args) {

        OptionsMenu optionsMenu = new OptionsMenu();

        optionsMenu.getStudentDB().setStudents(InitialStudents.studentsList());
        optionsMenu.StartConsole();

    }
}
