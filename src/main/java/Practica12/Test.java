package Practica12;



public class Test {

    public static void main(String[] args) {

        OptionsMenu optionsMenu = new OptionsMenu();
        optionsMenu.getStudentDB().setStudents(InitialStudents.studentsList());
        optionsMenu.StartConsole();

    }
}
