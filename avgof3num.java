package PS5;

public class avgof3num {
    public static int average(int a, int b, int c) {
        int sum=a+b+c;
        int average=sum/3;
        return average;
    }
    public static void main(String[] args) {
        int x=10;
        int y=20;
        int z=30;
        int n=average(x,y,z);
        System.out.println("average of 3 numbers are "+"= "+n);
    }
}
