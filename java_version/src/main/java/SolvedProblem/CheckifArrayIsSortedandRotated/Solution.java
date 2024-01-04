package SolvedProblem.CheckifArrayIsSortedandRotated;
/**
 * Author: Yuxuan Liu(Nash)
 * Time: 2021/5/5
 * Link of question: https://leetcode-cn.com/problems/check-if-array-is-sorted-and-rotated/
 *
 * Problem-solving ideas:
 *  检查是否有逆序 如果没有逆序 为true
 *  一个逆序 则判断最后一个元素是否小于等于第一个元素
 *  否则全为false
 *
 */
public class Solution {
    public boolean check(int[] nums) {
        int count = 0;
        for(int i = 1;i<nums.length;i++)
        {
            if(nums[i-1] > nums[i])
            {
                count++;
            }
        }

        if(count ==0)
        {
            return true;
        }
        if(count ==1)
        {
            if(nums[nums.length-1]<=nums[0])
            {
                return true;
            }
        }
        return false;
    }
}