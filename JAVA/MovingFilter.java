/*
In this problem you will process a list of integers using a “moving filter”. The filter
creates a subset of integers from the list. As the filter moves, a new subset of integers is
created. For each subset you will need to display the smallest integer value. For
example, given the list below:
12 15 11 7 19 5
Using a filter size of 2, the list of integers will be divided into subsets of two and the filter
will move one position to the right. The smallest integer for each sub set is displayed.
The list of smallest integers would be:
12 11 7 7 5
The result was obtained in the following manner. The initial subset based on a filter size
of 2 is 12 and 15. 12 is the smaller integer so it becomes the first entry in the answer.
This filter moves one position to the right and the subset becomes 15 and 11. 11 is the
smaller integer so it becomes the second entry in the answer. The filter moves one
position to the right and the subset becomes 11 and 7. 7 is the smaller integer so it
becomes the third entry in the answer. The filter moves one position to the right and the
subset becomes 7 and 19. 7 is the smaller integer so it becomes the fourth entry in the
answer. The filter moves one position to the right and the final subset becomes 19 and
5. 5 is the smaller integer so it becomes the final entry in the answer.
Input

The size of the filter will be an integer greater than 1 and less than or equal to the
number of integers in the list. The user will enter the number of integers in the list. Then
each integer value is entered. Read all the data from the console.
Output
The list of the smallest integer from each subset. Display the output on the monitor.
Test Data

Input Output

Enter filter size: 2
Enter size of array: 6
Enter integers separated by space:
12 15 11 7 19 5

12 11 7 7 5

Enter filter size: 4
Enter size of array: 8
Enter integers separated by space:
14 92 3 -7 18 -9 47 -12

-7 -7 -9 -9 -12
 */ 
import java.util.*;
public class MovingFilter
{
    public static void main()
    {
        int n,f,min=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        while(true) //taking a valid value of n as input 
        {
            n=sc.nextInt();
            sc.close();
            if(n>0)
              break;
            System.out.println("Invalid input, please give a proper input this time: ");
        }
        int a[]=new int[n];
        System.out.println("Enter "+n+" integers separated by a space: ");
        for(int i=0;i<n;i++) //taking as input the elements of the array 
          a[i]=sc.nextInt();
        System.out.println("Enter the size of the filter: ");
        while(true) //taking as input a valid size for the filter 
        {
            f=sc.nextInt();
            if(f>0 && f<n)
              break;
            System.out.println("Invalid input, please give a proper input this time: ");
        }
        int m[]=new int[n-f+1];
        for(int i=0;i<n-f+1;i++) //calculating the smallest numbers from each subset and storing them in an array 
        {
            min=a[i];
            for(int j=0;j<f;j++)
            {
                if(a[i+j]<min)
                  min=a[i+j];
            }
            m[i]=min;
        }
        System.out.println("The smallest numbers from each subset are:");
        for(int i=0;i<n-f+1;i++) //printing the smallest numbers from each subset 
          System.out.print(m[i]+" ");
    }
}