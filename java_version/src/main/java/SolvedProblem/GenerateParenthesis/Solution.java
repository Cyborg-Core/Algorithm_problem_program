package SolvedProblem.GenerateParenthesis;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    List<String> result = null;
    char[] record ;
    public List<String> generateParenthesis(int n) {
        result = new ArrayList<>();
        record = new char[n];
        record[0] = '(';
        dfs(1,0,record);
        return result;
    }
    void dfs(int index1,int index2,char[] record)
    {
        if(index1+index2 ==record.length)
        {
            result.add(new String(record));
            return;
        }
        else{
            if(index1 <record.length/2)
            {
                record[index1+index2] = '(';
                dfs(index1+1,index2,record);
                record[index1+index2] = 0;
            }
            if(index2<index1)
            {
                record[index1+index2] = ')';
                dfs(index1,index2+1,record);
                record[index1+index2] = 0;
            }
        }

    }
}