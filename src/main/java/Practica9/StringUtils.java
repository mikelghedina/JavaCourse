package Practica9;

public class StringUtils {

    public static boolean included(String word, String searched){
        if(word.trim().toLowerCase().contains(searched.trim().toLowerCase())){
            return true;
        }else {return false;}
    }
}
