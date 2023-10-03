import java.Scanner;
public class factorial {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the vallue of m : ");
    int m = sc.nextInt();
    int fact = 1;
    for(int i = 1;i<=m;i++){
        fact = fact*i;
    }
    System.out.print("Fctorial of "+m+" is "+fact);
    }

}