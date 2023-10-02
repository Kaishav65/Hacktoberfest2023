import java.util.Scanner;

public class UniqueIntegers
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter m: ");
        int m = in.nextInt();
        in.close();
        
        if (m < 1 || m > 30000) {
            System.out.println("Value of m should be between 1 and 30000");
            return;
        }
        
        System.out.print("Enter n: ");
        int n = in.nextInt();
        in.close();
        
        if (n < 1 || n > 30000) {
            System.out.println("Value of n should be between 1 and 30000");
            return;
        }
        
        if (m > n) {
            System.out.println("Value of m should be less than n");
            return;
        }
        
        System.out.println("The Unique-Digit integers are:");
        int count = 0;
        for (int i = m; i <= n; i++) {
            int num = i;
            boolean visited[] = new boolean[10];
            boolean isUnique = true;
            
            while (num != 0) {
                int d = num % 10;
                if (visited[d]) {
                    isUnique = false;
                    break;
                }
                visited[d] = true;
                num /= 10;
            }
            
            if (isUnique) {
                count++;
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("Frequency of unique-digit integers is: " + count);
    }
}