import java.util.Scanner;

public class FascinatingNumber
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number to check: ");
        int num = in.nextInt();
        in.close();
        
        if (num < 100) {
            System.out.println(num + " is not a Fascinating Number");
            return;
        }
        
        int num2 = num * 2;
        int num3 = num * 3;
        
        boolean isFascinating = true;
        String str = "" + num + num2 + num3;
        for (char i = '1'; i <= '9'; i++) {
            int idx1 = str.indexOf(i);
            int idx2 = str.lastIndexOf(i);
            if (idx1 == -1 || idx1 != idx2) {
                isFascinating = false;
                break;
            }
        }
        
        if (isFascinating)
            System.out.println(num + " is a Fascinating Number");
        else
            System.out.println(num + " is not a Fascinating Number");
    }
}