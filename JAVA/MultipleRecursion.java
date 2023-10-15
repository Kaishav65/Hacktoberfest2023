import java.util.Scanner;

public class MultipleRecursion {

    public static int ackermann(int m, int n) {
        if (m == 0) {
            return n + 1;
        } else if (m > 0 && n == 0) {
            return ackermann(m - 1, 1);
        } else if (m > 0 && n > 0) {
            return ackermann(m - 1, ackermann(m, n - 1));
        }
        return -1; // Handling invalid input
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a non-negative integer (m): ");
        int m = scanner.nextInt();
        System.out.print("Enter a non-negative integer (n): ");
        int n = scanner.nextInt();

        if (m >= 0 && n >= 0) {
            int result = ackermann(m, n);
            System.out.println("A(" + m + ", " + n + ") = " + result);
        } else {
            System.out.println("Please enter non-negative integers.");
        }

        scanner.close();
    }
}
