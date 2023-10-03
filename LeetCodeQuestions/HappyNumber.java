public class HappyNumber {
    //LEETCODE 202
    public static void main(String[] args) {
        //call your fn here
    }
    class Solution {
        public boolean isHappy(int n) {
            int slow = n;
            int fast = n;

            do {
                slow = Sq(slow);
                fast = Sq(Sq(fast));
            } while (slow != fast);

            if(slow == 1){
                return true;
            }
            return false;
        }
    }
        static int Sq(int x){
            int ans = 0;
            while(x > 0){
                int rem = x % 10;
                ans += rem * rem;
                x /= 10;
            }

            return ans;
        }
    }

