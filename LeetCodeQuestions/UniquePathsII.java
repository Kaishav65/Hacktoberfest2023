public class UniquePathsII {
    // LEETCODE 62
    public static void main(String[] args) {
        // call your fn here
    }
    class Solution {
        public int uniquePathsWithObstacles(int[][] obstacleGrid) {
            int x = obstacleGrid.length;
            int y = obstacleGrid[0].length;

            int[][] temp = new int[x][y];

            if (obstacleGrid[0][0] == 0) {
                temp[0][0] = 1;
            }

            for (int i = 0; i < x; i++) {
                for (int j = 0; j < y; j++) {
                    if (obstacleGrid[i][j] == 0) {
                        if (i > 0) {
                            temp[i][j] += temp[i - 1][j];
                        }
                        if (j > 0) {
                            temp[i][j] += temp[i][j - 1];
                        }
                    }
                }
            }

            return temp[x - 1][y - 1];
        }
    }

}
