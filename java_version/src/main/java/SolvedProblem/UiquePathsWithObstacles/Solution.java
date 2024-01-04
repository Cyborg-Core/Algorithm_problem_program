package SolvedProblem.UiquePathsWithObstacles;

public class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if(obstacleGrid.length == 0)
        {
            return 0;
        }
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int record[][] = new int[m][n];
        record[0][0] = 1;

        for (int i = 1; i < m; i++) {
            if(obstacleGrid[i][0] == 0)
            {
                record[i][0] = record[i-1][0];
            }
        }

        for (int i = 1; i < n; i++) {
            if(obstacleGrid[0][i] == 0)
            {
                record[0][i] = record[0][i-1];
            }
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if(obstacleGrid[i][j] == 0)
                {
                    record[i][j] = record[i-1][j] + record[i][j-1];
                }
            }
        }

        return record[m-1][n-1];

    }
}
