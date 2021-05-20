package BasicAlgorithm.DataStructuresAlgorithm;

import java.util.LinkedList;
import java.util.Queue;

public class QuickSort {
    static void sort(int[] arr, int begin, int end)
    {
        if(begin>=end)
        {
            return;
        }
        int tmp = arr[begin];
        int i = begin;
        int j = end;
        while (i<j)
        {
            if((i<j) && arr[j] >= tmp)
            {
                j--;
            }
            arr[i] = arr[j];
            if((i<j) && arr[i] <= tmp)
            {
                i++;
            }
            arr[j] = arr[i];
        }
        arr[i] = tmp;
        sort(arr,begin,i-1);
        sort(arr,i+1,end);
    }
    static void dfs(char[][] grad, int i, int j, int clazz)
    {
        if(grad[i][j] == 1) {
            grad[i][j] = (char) clazz;
            if (i - 1 >= 0) {
                dfs(grad, i - 1, j, clazz);
            }
            if (j - 1 >= 0) {
                dfs(grad, i, j - 1, clazz);
            }
            if (i + 1 < grad.length) {
                dfs(grad, i + 1, j, clazz);
            }
            if (j + 1 < grad[i].length) {
                dfs(grad, i, j + 1, clazz);
            }
        }
        else
        {
            return;
        }
    }
    public static int solve(char[][] grid) {
        // write code here
        int clazz = 1;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                    if(grid[i][j] == 1)
                    {
                        clazz++;
                        dfs(grid,i,j,clazz);
                    }
            }
        }
        return clazz-1;

    }
    public int maxProfit (int[] prices) {
        // write code here
        int max= 0;
        for(int i = 0;i < prices.length;i++){
            for (int j = 0; j < i; j++) {
                max = Math.max(max,prices[i]-prices[j]);
            }
        }
        return max;
    }
    public static int longestValidParentheses(String s) {
        // write code here

        int[] record = new int[s.length()];
        int max = 1;
        for (int i = 1; i < s.length(); i++) {
            if(s.charAt(i) == '(')
            {
                continue;
            }
            else {
                int p = i-1-record[i-1];
                if(p>=0&&s.charAt(p) == '(')
                {
                    record[i] = record[i-1]+2;
                    if(p-1>=0)
                    {
                        record[i]+=record[p-1];
                    }
                    max = Math.max(max,record[i]);
                }
            }

        }
        return max;
    }
    public static void main(String[] args)
    {
        System.out.println(longestValidParentheses("())"));
       /* String s = "";
        int n = s.length();
        boolean[][] record = new boolean[n][n];
        for(int right =1;right<n;right++)
        {
            for(int left= 0;left <right;left++)
            {
                if(s.charAt(left)!='(' || s.charAt(right) != ')')
                    continue;
                if(right-left)
            }
        }*/

       /* String A = "abc1234321ab";
        int n = 12;
        int max =1;
        boolean[][] record = new boolean[n][n];
        for (int right = 0; right < n; right++) {
            for (int left = 0; left <= right; left++) {
                if(A.charAt(left) != A.charAt(right))
                {
                    continue;
                }

                if(right-left == 0)
                {
                    record[left][right] = true;

                }else if(right-left<=2)
                {
                    record[left][right] = true;
                    if(max<right-left+1)
                    {
                        max = right-left+1;
                    }
                }else if(right-left>2)
                {
                    record[left][right] = record[left+1][right-1];
                    if(record[left][right] && max<right-left+1)
                    {
                        max = right-left+1;
                    }
                }

            }

        }
        System.out.println(max);*/







        /*int[] a = new int[]{8,9,6,3,2,1,6,4,7,9,5};
        sort(a,0,a.length-1);
        for (int i: a
             ) {
            System.out.println(i);
        }*/

        /*char[][] grid = new char[1][1];
        grid[0][0] = 1;/*new char[5][];
        grid[0] = new char[]{1,1,0,0,0};
        grid[1] = new char[]{0,1,0,1,1};
        grid[2] = new char[]{0,0,0,1,1};
        grid[3] = new char[]{0,0,0,0,0};
        grid[4] = new char[]{1,1,0,0,0};*/
        /*System.out.println(solve(grid));*/
        //System.out.println(MoreThanHalfNum_Solution(new int[]{4,2,1,4,2,4}));
    }
    public static int MoreThanHalfNum_Solution(int[] array) {
        Queue<Integer> q = new LinkedList();
        q.add(array[0]);
        for(int i = 1;i<array.length;i++)
        {
            if(q.peek() != array[i])
            {
                q.poll();
                if(q.isEmpty()&& ++i<array.length)
                {

                    q.add(array[i]);
                }
            }
            else{
                q.add(array[i]);
            }
        }
        if(q.isEmpty())
        {
            return 0;
        }
        else{
            int count = 0;
            int value = q.peek();
            for(int i = 0;i<array.length;i++)
            {
                if(array[i] == value)
                {
                    count++;
                }

            }
            if(array.length - count < count)
            {
                return value;
            }else
            {
                return 0;
            }
        }

    }
}
