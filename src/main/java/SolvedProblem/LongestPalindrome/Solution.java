package SolvedProblem.LongestPalindrome;

public class Solution {
    public String longestPalindrome(String s) {
        boolean[][] record = new boolean[s.length()][s.length()];
        for (int i = 0; i < s.length(); i++) {
            record[i][i] = true;
        }
        int beginIndex = 0;
        int endIndex = 1;
        int max = 1;
        for (int i = 1; i < s.length(); i++) {
            record[i-1][i] = s.charAt(i) == s.charAt(i-1);
            if(record[i-1][i])
            {
                beginIndex = i-1;
                endIndex = i+1;
                max = 2;
            }
        }

        for (int i = s.length()-2; i >=0; i--) {
            for (int j = i+2; j < s.length(); j++) {
                if(s.charAt(i) == s.charAt(j))
                {
                    if(record[i+1][j-1])
                    {
                        record[i][j] = true;
                        if(j-i+1 > max)
                        {
                            beginIndex = i;
                            endIndex = j+1;
                            max = j-i+1;
                        }
                    }
                    else{
                        record[i][j] = false;
                    }

                }

            }
        }


        return s.substring(beginIndex,endIndex);
    }
}