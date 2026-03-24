import java.util.Scanner;
public class Operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double res=0;
        char op = sc.next().charAt(0);
        if(r=='+'){
            res=a+b;
        }
        else if(r=='-'){
            res=a-b;
        }
        else if(r=='*'){
            res=a*b;
        }
        else if(r=='/'){
            res=a/b;
        }
        else if(r=='%'){
            res=a/b;
        }
        System.out.println(res);
    }
}
