import java.util.*;
import java.lang.*;
class root
{
    public static void main(String args[])
    {
        int a,b;
        Scanner S1=new Scanner(System.in);
        System.out.println("enter the numbers");
        a=S1.nextInt();
        b=S1.nextInt();
        double sqrt=Math.sqrt(a);
        double power=Math.pow(a,b);
        System.out.println("the root is:"+sqrt);
        System.out.println("the power is:"+power);
        S1.close();
    }
}