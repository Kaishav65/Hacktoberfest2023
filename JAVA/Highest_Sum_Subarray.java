class Sub_arr_sum
{
    public static void main()
    {
        int a[]={-1,-2,-3,-4};//The Array(1-D)
        int i=0,j=0,max_sum=0,sum=0;
        max_sum=a[0];
        for(i=0;i<=3;i++)
        {
            sum=0;/reinitialized
            for(j=i;j<=3;j++)
            {
                sum=sum+a[i];
                if(sum>max_sum)
                {
                    max_sum=sum;
                }
            }
        }
        
        System.out.println(max_sum);//display the sum of the highest valued subarray 
    }
}
