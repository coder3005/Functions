package Functions;
import java.util.*;

public class parameters1 {
    public static int calculateSum(int num1, int num2) { //parameters or formal parameters
        int sum=num1 + num2;
        return sum;
    }
    public static void main(String args[]) {
        Scanner r=new Scanner(System.in);
        int a=r.nextInt();
        int b=r.nextInt();
        int sum=calculateSum(a,b); // arguments or actual parameters
        System.out.println("sum is : " + sum);
        r.close();
        
    }
}
