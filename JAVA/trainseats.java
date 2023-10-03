import java.util.*; 
class trainseats
{
    public static void main(String []args)
    {
        int n,i,x=0,s=0,m=0;
        Scanner sc=new Scanner(System.in);
        int a[]=new int[120];
        int st[]=new int[120];
        String name[]=new String[120];
        int age[]=new int[120];
        String tr[]={"Chennai Mail","Darjeeling Mail","Puducherry Express"};
        String dest[]={"Howrah(HWH) to Chennai(MAS)","Sealdah(SDAH) to Darjeeling(NJP)","Howrah(HWH) to Puducherry(PDY)"};
        String dept[]={"30th June 2021 at 23:45hrs","1st July 2021 at 22:05hrs","2nd July 2021 at 23:30hrs"};
        String arrival[]={"1st July 2021 at 16:10hrs","2nd July 2021 at 15:35hrs","4th July 2021 at 8:50hrs"};
        int trn=((int)((Math.random()*3)));
        System.out.println("\t\t\tWELCOME TO INDIAN RAILWAYS PASSENGER RESERVATION ENQUIRY");
        System.out.println("\nYour train: "+tr[trn]+"\t\t"+"Route: "+dest[trn]);
        System.out.println("\nDeparture date and time: "+dept[trn]+"\t"+"Arrival date and time: "+arrival[trn]);
        for(i=0;i<120;i++)
        st[i]=i+1;
        while(true)
        {
            System.out.println("\nThe available seats are:-");
            for(i=0;i<120;i++)
            {
                if(st[i]!=0)
                System.out.print(st[i]+",");
            }
            System.out.println();
            System.out.println("Enter the number of seats to be booked:");
            n=sc.nextInt();
            m=m+n;
            System.out.println("Enter the passenger details");
            for(i=x;i<m;i++)
            {
                sc.nextLine();
                System.out.println("Enter the name:");
                name[i]=sc.nextLine();
                System.out.println("Enter the age:");
                age[i]=sc.nextInt();
                a[i]=((int)((Math.random()*120)))+1;
                st[a[i]-1]=0;
            }
            x=n;
            System.out.println("Do you wish to book any more tickets? If no, then press 'n' or 'N'");
            char ch=sc.next().charAt(0);
            if(ch=='n'||ch=='N')
            break;
        }
        System.out.println("The booked ticket history:");
        System.out.println("Name of passenger"+"\t"+"Age"+"\t"+"Seat number");
        for(i=s;i<m;i++)
        System.out.println(name[i]+"\t\t\t"+age[i]+"\t"+a[i]);
        System.out.println("The total fare of tickets Rs."+(m*1200.00));
    }
}