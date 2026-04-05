import java.util.*;

public class Main{
    public static void main(String[] args){
         String str = "           Hello-------Hi       ";
        str = str.trim();
        String[] s = str.split("-+");
        int count = 0;
        for(String word : s){
            count++;
        }
        System.out.println(count);
    }
}
