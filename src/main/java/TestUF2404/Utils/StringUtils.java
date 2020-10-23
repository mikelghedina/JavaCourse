package TestUF2404.Utils;

public class StringUtils {

    //Aquest mètode static ens assegura que dues Strings són iguals.
    public static boolean included (String command, String command2) {
        if (command.toLowerCase().equalsIgnoreCase(command2.toLowerCase())) {
            return true;
        }
        return false;
    }
}
