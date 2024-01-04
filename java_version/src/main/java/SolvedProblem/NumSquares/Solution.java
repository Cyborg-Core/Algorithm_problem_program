package SolvedProblem.NumSquares;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int numSquares(int n) {
        List<Integer> square = new ArrayList<>();
        for(int i = 1; i*i<=n;i++)
        {
            square.add(i*i);
        }
        int[] dp = new int[n+1];
        dp[1] = 1;
        for (int i = 2; i <= n ; i++) {
            int min = Integer.MAX_VALUE;
            for (int s: square
                 ) {
                if(i - s >=1)
                {
                    Math.min(min, dp[i-s]+1);
                }
            }
        }
        return dp[n];
    }
}
