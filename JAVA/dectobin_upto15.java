import java.util.Scanner;
public class dectobin_upto15 {
    
    public static void convert(int dec_num){    
        int bin_num[] = new int[100];    
        int index = 0;    
        while(dec_num > 0){    
          bin_num[index++] = dec_num%2;    
          dec_num = dec_num/2;    
        }    
        for(int i = index-1;i >= 0;i--){    
          System.out.print(bin_num[i]);    
        }    
   System.out.println();
   }    
   public static void main(String args[]){      
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter a Decimal Number: ");
   int decimal = sc.nextInt();
   System.out.println("Binary number is ");
   convert(decimal);
   }
}      

