package Functions;

public class binomialcoefficient {
    public static int BC(int n) {
        int fact=1;
        for(int i=2;i<=n;i++) {
            fact=fact*i;
        }
        return fact;
        
    }
    public static void main(String[] args) {
        int n=5;
        int r=2;
        int a=BC(n);
        int b=BC(r);
        int c=BC(n-r);
        float bc=a/(b*c);
        System.out.println("binomial coeff is " + bc);
    }
}
