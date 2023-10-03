import java.util.*;
//LEETCODE 58
public class LengthOfLastWord {
    public static void main(String[] args) {
        //call your fn here
    }
    class Solution {
        public int lengthOfLastWord(String s) {
            int count = 0;
            int i = s.length() - 1;
            while(i >= 0){
                char ch = s.charAt(i);
                if(ch == ' ' && count == 0){
                    i--;
                    continue;
                }
                if(ch != ' '){
                    count++;
                    i--;
                } else{
                    return count;
                }
            }
            return count;
        }
    }
}
