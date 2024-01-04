package BasicAlgorithm.DataStructuresAlgorithm.KMP_Algorithm;

public class Solution {

    static boolean kmp(String a, String b)
    {
        int[] next = new int[a.length()];
        for(int i =1;i<a.length();i++)
        {
            if(a.charAt(i) == a.charAt(next[i-1]))
            {
                next[i] = next[i-1]+1;
            }
        }
        for (int i: next
             ) {
            System.out.println(i);
        }
        return false;
    }
    public static void main(String[] args)
    {
        kmp("ababdbab","");
    }
}
