package Functions;

public class factorial {
    public static int fact(int a) {
        int fact=1;
        for(int i=2;i<=a;i++) {
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        int a=0;
        int factorial=fact(a);
        System.out.println("factorial is " + factorial);
    }
}
