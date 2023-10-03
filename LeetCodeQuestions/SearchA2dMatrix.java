public class SearchA2dMatrix {
    // LEETCODE 74
    public static void main(String[] args) {
        // call your fn here
    }
    class Solution {
        public boolean searchMatrix(int[][] matrix, int target) {
            int rows = matrix.length;
            int cols = matrix[0].length;
            
            int left = 0;
            int right = rows * cols - 1;
            
            while (left <= right) {
                int mid = left + (right - left) / 2;
                int midValue = matrix[mid / cols][mid % cols];
                
                if (midValue == target) {
                    return true;
                } else if (midValue < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            
            return false;
        }
    }
    
}
