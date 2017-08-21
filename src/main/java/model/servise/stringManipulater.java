package model.servise;

/**
 * Created by HP on 31.07.2017.
 */
public class stringManipulater {
    public static String setFirstCharAtUpperCase(String string){
        return new StringBuilder(string).deleteCharAt(0).insert(0,("" + string.charAt(0)).toUpperCase()).toString();
    }
}
