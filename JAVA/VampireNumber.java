import java.util.*;
public class VampireNumbers
{
    public static void main(String []args)
    {
        int count=0,d,i=0,j=0,k,x=0,y=0,c=0,g,flag=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int num=n;
        String s=Integer.toString(num);
        while(n!=0){
            n=n/10;
            count++;
        }
        if(count%2!=0)
        {
            System.out.println("Not a Vampire Number");
            System.exit(0);
        }
        int a[]=new int[count];
        n=num;
        while(n!=0)
        {
            d=n%10;
            a[i]=d;
            n=n/10;
            i++;
        }
        for(i=0;i<count-1;i++)
        {
            for(j=0;j<count-1-j;j++)
            {
                if(a[j]<a[j+1])
                {
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        for(i=0;i<count/2;i++)
        {
            x=x*10+a[i];
        }
        for(i=count/2;i<count;i++)
        {
            y=y*10+a[i];
        }
        for(i=x;i>=y;i--)
        {
            for(j=y;j<=x;j++)
            {
                if(i*j==num)
                {
                    String s1=Integer.toString(i);
                    String s2=Integer.toString(j);
                    String s3=s1+s2;
                    for(k=0;k<s.length();k++)
                    {
                        c=0;
                        for(g=0;g<s3.length();g++)
                        {
                            if(s.charAt(k)==s3.charAt(g))
                            c++;
                        }
                        if(c>1)
                        break;
                    }
                    if(c<=1)
                    {
                        System.out.println(num+" is a Vampire Number.");
                        System.exit(0);
                    }
                }
                else
                flag=1;
            }
        }
        if(flag==1)
        {
            System.out.println("Not a Vampire Number");
        }
        sc.close();
    }
}
