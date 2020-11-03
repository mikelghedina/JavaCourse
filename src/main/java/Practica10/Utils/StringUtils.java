package Practica10.Utils;

import Practica10.Model.Bird;

public class StringUtils {

    public static Boolean included(Bird bird, String string){
        return bird.getName().trim().equalsIgnoreCase(string.trim());
    }
}
