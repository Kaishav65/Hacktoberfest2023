/*Java program to calculate the prime factorials of a given number and also print their sum */

import java.util.*;
public class Primefact
{
    int num, sum;
    Primefact()
    {
        num=0; 
        sum=0;
    }
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        sc.close();
    }
    void generateFacts()
    {
        int t=num;
        System.out.println("The prime factors are:");
        for(int i=2;i<num;i++)
        {
            while(num%i==0)
            {
                System.out.println(i);
                sum+=i;
                num=num/i;
            }
        }
        if(num>2)
        {
            System.out.println(num); 
            sum+=num;
        } 
        num=t;
    }
    void display()
    {
        System.out.println("The original number is "+num+" and the sum of its prime factors is "+sum);
    }
    public static void main(String []args)
    {
        System.out.println("Enter a number");
        Primefact ob=new Primefact();
        ob.accept();
        ob.generateFacts();
        ob.display();
    }
}