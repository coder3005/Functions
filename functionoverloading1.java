package Functions;

public class functionoverloading1 {
    //func to calc sum of 2 nums
    public static int sum(int a, int b) {
        return a+b;
    }

    //func to  calc sum of 3 nums
    public static float sum(float a, float b) {
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println(sum(3,5));
        System.out.println(sum(5.2f,3.2f));
    }
}
