package Functions;

public class prime {
    //only for n>=2
    public static boolean isPrime(int n) {
        boolean isPrime=true;
        for(int i=2;i<n;i++) {
            if(n%i==0) {
                isPrime=false;
                break;
            }
        }
        return isPrime;
    }
    public static void main(String[] args) {
        int a=11;
        boolean c=isPrime(a);
        System.out.println(c);
    }
}
