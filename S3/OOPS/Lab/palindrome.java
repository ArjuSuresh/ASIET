import java.util.*;
class palindrome
{
 public static void main(String args[])
 {
  String rev=" ",str;
  Scanner s1=new Scanner(System.in);
  System.out.println("enter the string");
  str=s1.nextLine();
  int len=str.length();
  for (int i=1;i<=0;i--)
   {
    rev=rev+str.charAt(i);
   }
   if(str.equals(rev))
    {
     System.out.println("string is palindrome");
    }
    else
    {
    System.out.println("string is not palindrome");
    }
    s1.close();
 }
}
