import java.util.*;
class Space_remove
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        String str=" ",str2=" ";
        char ch=' ';
        int i=0,as=0,l=0;
        
        System.out.println("Enter a Sentence");
        str=obj.nextLine();
        str=str.trim(); 
        l=str.length();
        
        for(i=0;i<=l-1;i++)
        {
             ch=str.charAt(i);
             str2=str2+ch;
             as=(int)ch;
             
             if(as==32)//if whitespace found
             {
                 while(((int)str.charAt((i+1)))==32)
                 {
                     i++;   
                 }
             }
        }
        System.out.println("Final sentence:-"+str2);
        
    }
}
