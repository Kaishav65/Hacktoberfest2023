import java.util.Scanner;

public class EvilNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive number: ");

        int n = scanner.nextInt();
        scanner.close();

        if (n < 0) {
            System.out.println("Invalid Input");
            return;
        }

        int count = 0, binNum = 0, p = 0;

        while (n > 0) {
            count += n % 2;
            binNum += (n % 2) * Math.pow(10, p++);
            n /= 2;
        }

        System.out.println("Binary Equivalent: " + binNum);
        System.out.println("No. of 1's: " + count);
        System.out.println(count % 2 == 0 ? "Output: Evil Number" : "Output: Not an Evil Number");
    }
}
