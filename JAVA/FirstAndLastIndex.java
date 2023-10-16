import java.util.Scanner;
public class FirstAndLastIndex 
{ 
    public static void main(String[] args) 
    { 
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter String:");
            String str = sc.next(); 
            System.out.println("Enter character or substring to search: ");
            String substr = sc.next(); 
            System.out.println("First occurence "+ str.indexOf(substr)); 
            System.out.println("Last occurence "+ str.lastIndexOf(substr));
        } 
    } 
}