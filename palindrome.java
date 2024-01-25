package PS5;
import java.util.*;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r,s=0;
        int c=n;
        while(n>0) {
            r=n%10;
            s=(s*10)+r;
            n=n/10;
        }
        if(c==s) {
            System.out.println("number is palindrome");
        }
        else {
            System.out.println("number is not palindrome");
        }
        sc.close();
    }
}
