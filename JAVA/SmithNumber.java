import java.util.*;
public class SmithNumber
{
    boolean isPrime(int n)
    {
        int c=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            c++;
        }
        if(c==2)
        return true;
        else
        return false;
    }
    int digitsum(int n)
    {
        int s=0;int d;
        while(n!=0)
        {
            d=n%10;
            s=s+d;
            n=n/10;
        }
        return s;
    }
    public static void main(String []args)
    {
        int i,k=0,x,m;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        m=sc.nextInt();
        sc.close();
        int num=m;
        SmithNumber ob =new SmithNumber();
        x=ob.digitsum(m);
        for(i=2;i<=m/2;i++)
        {
            if(num%i==0)
            {
              if(ob.isPrime(i)==true)
              {
               k=k+ob.digitsum(i);
               num=num/i;
               i--;
            }
            }
        }
        if(k==x)
        System.out.println("Smith Number");
        else
        System.out.println("Not a Smith Number");
    }
}