package SolvedProblem.LengthOfLastWord;

public class Solution {
    public int lengthOfLastWord(String s) {
        String[] b = s.split(" ");
        for(int i = b.length-1; i>=0;i--)
        {
            if(!b[i].equals(" "))
            {
                return b[i].length();
            }
        }
        return  0;
    }
}
