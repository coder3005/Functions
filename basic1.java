package Functions;
import java.util.*;

public class basic1 {
    public static void printHelloWorld() {
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
    }

    public static void calculateSum() {
        Scanner r=new Scanner(System.in);
        int a=r.nextInt();
        int b=r.nextInt();
        int sum=a+b;
        System.out.println("sum is : " + sum);
        r.close();
    }
    public static void main(String args[]) {
        calculateSum();
        
    }
}
