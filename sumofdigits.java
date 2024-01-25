package PS5;
import java.util.*;

public class sumofdigits {
    public static int sumOfdigits(int n) {
        int sum=0;
        int r;
        while(n>0) {
            r=n%10;
            sum+=r;
            n=n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int a=sumOfdigits(n);
        System.out.println("sum of digits is : " + a);
        sc.close();
    }
}
