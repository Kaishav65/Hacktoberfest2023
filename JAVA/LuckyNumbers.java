import java.util.*;
public class LuckyNumbers
{
    public static void main(String []args)
    {
        int n, i,j,k=0, x,y=2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        n=sc.nextInt();
        sc.close();
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=i+1;
        }
        int p=(int)Math.sqrt(n);
        for(i=1;i<=p;i++)
        {
            x=i; k=0;
            for(j=0;j<n;j++)
            {
                if(j==x)
                x+=y;
                else
                {
                    a[k]=a[j];
                    k++;
                }
                
            }
            y++;
        }
        System.out.println("The Lucky numbers are:");
        for(i=0;i<p;i++)
        System.out.print(a[i]+" ");
    }
}