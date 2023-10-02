package Hacktoberfest2023.JAVA;

public class CheckPalindrome {
     boolean checkPalindromeString(int start,int end,String s)
     {
          if(start>=end)
          {
               return true;
          }
          if(s.charAt(start)!=s.charAt(end))
          {
               return false;
          }
          return checkPalindromeString(start+1, end-1, s);
     }
     boolean palindrome(String s)
     {
          return checkPalindromeString(0, s.length()-1, s);
     }
     public static void main(String[] args) {
          
          CheckPalindrome check=new CheckPalindrome();
          String s="racecart";
          
          System.out.println(check.palindrome(s));


     }
}

