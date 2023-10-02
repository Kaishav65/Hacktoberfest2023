//Java program to check whether a given number is a Palindrome or not 

import java.util.Scanner;

public class PalindromeNumber
{
        public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        sc.close();
        int copyNum = num;
        int revNum = 0;

        while(copyNum != 0) {
            int digit = copyNum % 10;
            copyNum /= 10;
            revNum = revNum * 10 + digit;
        }

        if (revNum == num) 
            System.out.println(num+" is a  Palindrome number");
        else
            System.out.println(num+" is not a Palindrome number");
    }
}