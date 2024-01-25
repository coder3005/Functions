package PS5;

public class mathclass1 {
    public static void main(String[] args)     
    {    
        double a = 30;    
        double b = Math.toRadians(a);      
        System.out.println("Sine value of a is: " +Math.sin(a));  
        System.out.println("Cosine value of a is: " +Math.cos(a));  
        System.out.println("Tangent value of a is: " +Math.tan(a));      
        System.out.println("Sine value of a is: " +Math.asin(b));  //sin inverse
        System.out.println("Cosine value of a is: " +Math.acos(b));  //cos inverse
        System.out.println("Tangent value of a is: " +Math.atan(b));   //tan inverse   
        System.out.println("Sine value of a is: " +Math.sinh(a));
        System.out.println("Cosine value of a is: " +Math.cosh(a)); 
        System.out.println("Tangent value of a is: " +Math.tanh(a));  
    }
}
