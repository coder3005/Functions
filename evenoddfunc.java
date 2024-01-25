package PS5;
import java.util.*;

public class evenoddfunc {
    public static boolean isEven(int n) {
        if(n%2==0) {
            return true;
        }
            return false;
            
    }
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in) ;
        System.out.println("enter  a number");
        int a=r.nextInt();
        System.out.println(isEven(a));
        if(isEven(6)) {
            System.out.println("function is working fine");
        }
        else {
            System.out.println("there is some error in function");
        }
        if(isEven(7)) {
            System.out.println("there is some error in function");
        }
        else {
            System.out.println("function is working fine");
        }
        r.close();
    }
}
