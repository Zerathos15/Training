package Training;
import java.util.*;
public class Countofcharactertype {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int alpha=0, digits=0, symbols=0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                alpha++;
            } else if (ch >= '0' && ch <= '9') {
                digits++;
            } else {
                symbols++;
            }
        }
        System.out.println(alpha);
        System.out.println(digits);
        System.out.println(symbols);
    }
}
