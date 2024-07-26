import java.util.*;
class average
{
    public static void main(String args[])
    {
        int a,b,sum,avg;
        Scanner s1=new Scanner(System.in);
        System.out.println("enter the numbers");
        a=s1.nextInt();
        b=s1.nextInt();
        sum=a+b;
        avg=sum/2;
        System.out.println("the sum is:"+sum);
        System.out.println("the average is:"+avg);
        s1.close();
    }
}