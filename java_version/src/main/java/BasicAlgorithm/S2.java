package BasicAlgorithm;
import java.util.*;


public class S2{
    /**
     *
     * @param numbers int整型一维数组
     * @param target int整型
     * @return int整型一维数组
     */
    public static int[] twoSum (int[] numbers, int target) {
        // write code here
        int[] record = new int[target+1];
        for(int i = 1;i<=numbers.length;i++)
        {
            int input = numbers[i-1];
            System.out.println(input);
            if(input>target)
            {

                continue;
            }
            if(record[target-input] != 0)
            {
                System.out.println(record[target-input]);
                System.out.println(i);
                return new int[]{record[target-input],i};
            }
            record[numbers[i-1]] =i;
            String a = "dfdsf";
            a.length();
        }
        return new int[]{};
    }
    public static void main(String[] args)
    {
        twoSum(new int[]{20,110,170,70},90);
    }
}