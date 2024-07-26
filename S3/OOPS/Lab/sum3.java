import java.util.*;
class threesum
{
    public static void main(String args[])
    {
        Scanner S1 = new Scanner(System.in);
        System.out.println("Enter the numbers:");
        float a = S1.nextFloat(); 
        float b = S1.nextFloat(); 
        float c = S1.nextFloat();
        float sum = a+b+c;          
        System.out.println("the sum is: "+sum);
        S1.close();
    }
}