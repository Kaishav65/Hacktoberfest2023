public class RemoveDuplicatesFromSortedArray{
    // LEETCODE 26
    public static void main(String[] args) {
        // call your fn here
    }
    // ans
    class Solution {
        public int removeDuplicates(int[] nums) {
            int n = nums.length;
            int k = 0; 
            
            for (int i = 0; i < n; i++) {
                if (i == 0 || nums[i] != nums[i - 1]) {
                    nums[k] = nums[i]; 
                    k++;
                }
            }
            
            return k;
        }
    }
    
}