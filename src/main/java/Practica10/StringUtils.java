package Practica10;

public class StringUtils {

    public static Boolean included(Bird bird, String string){
        return bird.getName().trim().equalsIgnoreCase(string.trim());
    }
}
