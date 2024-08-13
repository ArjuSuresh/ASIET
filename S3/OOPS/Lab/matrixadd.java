import java.util.*;
public class matrixadd
{
    public static void main(String args[])
    {
        int a[][]=new int[50][50];
        int b[][]=new int[50][50];
        int sum[][]=new int[50][50];
        int i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows");
        int m=sc.nextInt();
        System.out.println("Enter columns");
        int n=sc.nextInt();
        System.out.println("Enter elements of first matrix: ");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter elements of second matrix: ");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                sum[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.println("Sum is: ");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(sum[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
