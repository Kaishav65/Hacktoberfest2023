public class RotateImg {
    // LEETCODE 48
    public static void main(String[] args) {
        // call your fn here
    }

    class Solution {
        public void rotate(int[][] matrix) {
            int n = matrix.length;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= i; j++) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }

            for (int i = 0; i < n; i++) {
                int j = 0;
                int k = n - 1;
                while (j < k) {
                    int t = matrix[i][j];
                    matrix[i][j] = matrix[i][k];
                    matrix[i][k] = t;
                    j++;
                    k--;
                }
            }
        }
    }
}
