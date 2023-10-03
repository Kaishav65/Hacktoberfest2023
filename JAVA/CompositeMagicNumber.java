import java.util.Scanner;

public class CompositeMagicNumber
{
    public static void main(String []args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter m: ");
        int m = in.nextInt();

        System.out.print("Enter n: ");
        int n = in.nextInt();
        in.close();

        if (m < 1 || n < 1 || m > n) {
            System.out.println("Invalid input");
            return;
        }

        System.out.println("The composite magic numbers are:");
        int count = 0;
        for (int i = m; i <= n; i++) {

            boolean isComposite = false;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isComposite = true;
                    break;
                }
            }

            if (isComposite && i != 1) {
                int num = i;
                while (num > 9) {
                    int sum = 0;
                    while (num != 0) {
                        int d = num % 10;
                        num /= 10;
                        sum += d;
                    }
                    num = sum;
                }

                if (num == 1) {
                    count++;
                    System.out.print(i + " ");
                }
            }
        }
        System.out.println();
        System.out.println("Frequency of composite magic numbers: " + count);
    }
}