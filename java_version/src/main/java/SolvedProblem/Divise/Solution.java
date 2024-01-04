package SolvedProblem.Divise;

public class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend == Integer.MIN_VALUE && divisor ==-1)
        {
            return Integer.MAX_VALUE;
        }
        if(dividend < divisor || dividend ==0)
        {
            return 0;
        }
        if(dividend < divisor+divisor)
        {
            return 1;
        }
        int a = Math.abs(dividend);
        int b = Math.abs(divisor);
        int time = b;
        for (int i = 2; i < 33; i++) {
            time+=b;
            if(time >= a)
            {
                if(dividend >0 && divisor>0 ||dividend >0 && divisor>0)
                {
                    return i;
                }
                else return -1;
            }
        }

        return 0;
    }
}
