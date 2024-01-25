package Functions;

public class prime1 {
    //only for n>=2
    public static boolean isPrime(int n) {
        if(n==2) {  // to consume less time
            return true;
        }
        
        for(int i=2;i<n;i++) {
            if(n%i==0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int a=2;
        boolean c=isPrime(a);
        System.out.println(c);
    }
}
