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


class hacktoberfest2023 { 
    // Iterative function to 
    // reverse the digits of number 
    static int reversNumber(int n) 
    { 
        int reversed_n = 0; 
        while (n > 0) { 
            reversed_n = reversed_n * 10 + n % 10; 
            n = n / 10; 
        } 
        return reversed_n; 
    } 
  
    // Main function 
    public static void main(String[] args) 
    { 
        int n = 123464321; 
        int reverseN = reversNumber(n); 
        System.out.println("Reverse of n = " + reverseN); 
  
        // Checking if n is same 
        // as reverse of n 
        if (n == reverseN) 
            System.out.println("Palindrome = Yes"); 
        else
            System.out.println("Palindrome = No"); 
    } 
}
