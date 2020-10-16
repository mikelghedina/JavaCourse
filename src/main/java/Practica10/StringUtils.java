package Practica10;

public class StringUtils {

    public static Boolean included(Bird bird, String string){
        if(bird.getName().trim().equalsIgnoreCase(string.trim())){
            return true;
        }
        return false;
    }
}
