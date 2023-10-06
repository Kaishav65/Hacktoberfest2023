import java.util.*;
import java.util.Scanner;

public class AliceAdam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bagsize=sc.nextInt();
        String bagstr=sc.next();
        int strsize=sc.nextInt();
        String str=sc.next();
        int flag=0;

        Set<Character> set=new HashSet<>();

        for(char i:bagstr.toCharArray())
        {
            set.add(i);
        }
        for(char i:str.toCharArray())
        {
            if(set.contains(i))
                flag=1;
            else
            {
                flag=0;
                break;
            }
        }
        if(flag==0)
            System.out.println("No");
        else
            System.out.println("Yes");
    }
}
