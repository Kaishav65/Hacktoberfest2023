import java.io.*; 
  
class spyNumber { 
    public static void main(String[] args) 
    { 
        int product = 1, sum = 0, ld; 
        int n = 22;       
        while (n > 0) { 
            ld = n % 10; 
            sum = sum + ld; 
            product = product * ld; 
            n = n / 10; 
        }  
        if (sum == product) 
            System.out.println( 
                "Given number is spy number"); 
        else
            System.out.println( 
                "Given number is not spy number"); 
    } 
}
