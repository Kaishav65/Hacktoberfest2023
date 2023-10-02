import java.util.Scanner;

public class EvilNumber
{
     public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int n = in.nextInt();
        in.close();
        if (n < 0) {
            System.out.println("Invalid Input");
            return;
        }
        
        int count = 0;
        int p = 0;
        int binNum = 0;
        
        while (n > 0) {
            int d = n % 2;
            if (d == 1)
                count++;
            binNum += (int)(d * Math.pow(10, p));
            p++;
            n /= 2;
        }
        
        System.out.println("Binary Equivalent: " + binNum);
        System.out.println("No. of 1's: " + count);
        
        if (count % 2 == 0)
            System.out.println("Output: Evil Number");
        else
            System.out.println("Output: Not an Evil Number");
    }
}