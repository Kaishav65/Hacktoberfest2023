import java.util.*;
public class KeithNumber
{
    public static void main()
    {
        int n, i,j=0,k,c=0,s=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        n=sc.nextInt();
        sc.close();
        int n1=n;
        while(n!=0)
        {
            n=n/10;
            c++;
        }
        int a[]=new int[c];
        n=n1;
        
        while(n!=0)
        {
            a[j]=n%10;
            j++;
            n=n/10;
        }
        k=c;
        while(s<n1)
        {
            s=0;
            for(i=0;i<c;i++)
            {
                s=s+a[i];
            }
            if(s==n1)
            {
                System.out.println("Keith Number");
                break;
            }
            a[k-1]=s;
            k--;
            if(k==0)
            k=c;
            
        }
        if(s>n1)
        System.out.println("Not a Keith Number");
    }
}