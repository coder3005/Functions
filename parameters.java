package Functions;
import java.util.*;

public class parameters {
    public static void printHelloWorld() {
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
    }

    public static void calculateSum(int num1, int num2) {
        
        int sum=num1 + num2;
        System.out.println("sum is : " + sum);
        
    }
    public static void main(String args[]) {
        Scanner r=new Scanner(System.in);
        int a=r.nextInt();
        int b=r.nextInt();
        calculateSum(a,b);
        r.close();
        
    }
}
