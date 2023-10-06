
import java.util.Scanner;

class DiviorNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        long no=0;
        while(t-->0)
        {
            long x=sc.nextLong();
            long y=sc.nextLong();
            long z=sc.nextLong();
            if(y%z==0)
                System.out.println("-1");
            else
            {
                for(long i=1;i>0;i++)
                {
                    no=i*y;
                    if(no>x&&no%z!=0)
                    {
                        System.out.println(no);  
                        break;
                    }
                }
            }
            
    }
    
}
}
