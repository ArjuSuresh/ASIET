//program to print multiplication table
//Arjun Suresh
//Roll No:15
import java.util.*;
class multiplication
{
 public static void main(String args[])
  {
   int i,p;
   Scanner s1=new Scanner(System.in);
   System.out.println("enter the numbers:");
   int n=s1.nextInt();
   System.out.println("enter the range:");
   int r=s1.nextInt();
   for(i=1;i<=r;i++)
   {
     p=i*n;
     System.out.println(i+"*"+r+"="+p);
   }
  }
}
