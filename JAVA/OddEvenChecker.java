 import java.util.Scanner;
public class OddEvenChecker {
    public static void main(String[] args) {
         Scanner input00 = new Scanner(System.in);
        System.out.print("Input Number: ");
        int angka = input00.nextInt();
        if (angka % 2 ==0){
            System.out.println("Number " + angka + " is a odd number");
        }else{
            System.out.println("Number " + angka + " is a even number");
        }
        String  hasil = (angka % 2 == 0) ? "Odd number" : "Even Number";
        System.out.println("Number " + angka + " Is = " + hasil);
    }
}
    
