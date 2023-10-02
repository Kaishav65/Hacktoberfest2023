/*Java program to check whether a given number is an Armstrong Number.
 * An armstrong number is a number which is equal to the sum of each of its digits raised to the number
 * of digits. 
 * For example, 
 * 153=1^3+5^3+3^3
 */

import java.util.Scanner;

public class ArmstrongNumber
{
    public int armstrong(int n) {
        
        int num = n, powerSum = 0;  
        String s=Integer.toString(n);
        int l=s.length();
        
        while (num > 0) {
            int digit = num % 10;
            powerSum = (int) (powerSum + (Math.pow(digit,l)));
            num /= 10;
        }
        
        if (powerSum == n)
            return 1;
        else
            return 0;
    }
    
    public static void main(String args[]) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = in.nextInt();
        in.close();
        
        ArmstrongNumber obj = new ArmstrongNumber();
        int r = obj.armstrong(num);
        
        if (r == 1)
            System.out.println(num + " is an Armstrong number");
        else
            System.out.println(num + " is not an Armstrong number");
    }
}