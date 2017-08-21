package controller.checker;

public class Checker implements CheckPatterns{
    public boolean check(String input, String pattern){
        if(input.matches(pattern)){
            return true;
        }
        return false;
    }
}
