package UnsortProgram;

public class DynamicProgramming {

    public static int Jump(int n, int[] A) {
        // write code here
        n = 3;
        A = new int[]{2,3,1};
        int[] record = new int[n+1];
        for (int i = 2; i <=n ; i++) {
            record[i] = n + 1;
        }
        for (int i = 1; i < n ; i++) {
            for (int j = 1; j <= A[i]; j++) {
                if (i + j <= n) {
                    record[i + j] = Math.min(record[i + j], record[i] + 1);
                }

            }
        }
        System.out.println(record[n]);
        return record[n];
    }

    public static int knapsack(int V, int n, int[][] vw) {
        // write code here
        vw[0][0] = 1;
        vw[0][1] = 3;
        vw[1][0] = 10;
        vw[1][1] = 4;
        int[][] dp = new int[V+1][n+1];
        for (int i = 1; i <= V; i++) {
            for (int j = 1; j <= n ; j++) {
                if(i-vw[j-1][0] >=0 )
                {
                    dp[i][j] = Math.max(dp[i][j-1], dp[i-vw[j-1][0]][j-1] + vw[j-1][1]);
                }
                else
                {
                    dp[i][j] = dp[i][j-1];
                }
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        return dp[V][n];


    }
    public static void main(String[] args)
    {
       /* String[] strs = {"10","1", "0"};
        System.out.println(findMaxForm(strs,1,1));*/

        //System.out.println(knapsack(10,2,(new int[2][2])));
        Jump(1,null);
    }

    public static int findMaxForm(String[] strs, int m, int n) {
        int[][] mn = new int[strs.length][2];
        int[][][] dpTable = new int[strs.length ][m+1][n+1];

        for (int index = 0;index<strs.length;index++) {
            for(int i = 0;i<strs[index].length();i++)
            {
                if (strs[index].charAt(i) == '0'){
                    mn[index][0]++;
                }
                else {
                    mn[index][1]++;
                }
            }
        }
        for (int i = 0;i<strs.length;i++)
        {
            System.out.println(mn[i][0]+" "+mn[i][1]);

        }
        for(int i =0;i<=m;i++)
        {
            for(int j = 0;j<=n;j++)
            {
                if(i>=mn[0][0] && j>=mn[0][1]) {
                    dpTable[0][i][j] = 1;
                }
                System.out.print(dpTable[0][i][j]);
            }
            System.out.println();
        }
        int max = 0;
        for(int i =1;i<=m;i++)
        {
            for(int j = 1;j<=n;j++)
            {
                for(int k = 1;k<strs.length;k++)
                {
                    if(i-mn[k][0] >=0 && j-mn[k][1]>=0)
                    {
                        dpTable[k][i][j] = Math.max(dpTable[k-1][i][j],dpTable[k-1][i-mn[k][0]][j-mn[k][1]]+1);
                        max = Math.max(dpTable[k][i][j],max);

                    }
                    else{
                        dpTable[k][i][j]= dpTable[k-1][i][j];
                    }
                }
            }
        }
        for (int i = 0; i < strs.length; i++) {
            System.out.println(dpTable[i][m][n]);
        }

        return  max;


    }
}
