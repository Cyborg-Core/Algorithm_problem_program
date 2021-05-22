package InterviewQuestions.LongestValidParentheses;

/**
 * Author: Yuxuan Liu(Nash)
 * Time: 2021/5/20
 * Link of question: https://leetcode-cn.com/problems/longest-valid-parentheses
 *
 * Problem-solving ideas:
 *  递推公式 reocrd[i]] = record[i-1]+2 + record[i-2-record[i-1]];
 *  注意数据越界问题
 */
public class Solution {

    public int longestValidParentheses(String s) {
        int record[] = new int[s.length()];
        int max = 0;
        for(int i = 1;i<s.length();i++)
        {

            if(s.charAt(i) == ')' && i-1-record[i-1]>=0 && s.charAt(i-1-record[i-1]) =='(')
            {
                record[i] = record[i-1]+2;
                if(i-2-record[i-1]>=0)
                {
                    record[i]+= record[i-2-record[i-1]];
                }
                if (record[i]>max)
                {
                    max = record[i];
                }

            }

        }
        return max;

    }
}
