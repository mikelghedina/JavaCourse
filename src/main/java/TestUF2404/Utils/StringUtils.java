package TestUF2404.Utils;

public class StringUtils {

    public static boolean included (String command, String command2) {
        if (command.toLowerCase().equalsIgnoreCase(command2.toLowerCase())) {
            return true;
        }
        return false;
    }
}
