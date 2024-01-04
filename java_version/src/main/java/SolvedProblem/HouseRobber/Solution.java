package SolvedProblem.HouseRobber;

/**
 * Author: Yuxuan Liu(Nash)
 * Time: 2021/5/5
 * Link of question: https://leetcode-cn.com/problems/house-robber/
 *
 * Problem-solving ideas:
 *  递推公式Math.max(record[i-2] + nums[i], record[i-1]);
 *
 */

class Solution {
    public int rob(int[] nums) {
        int[] record = new int[nums.length];
        record[0] = nums[0];
        if(nums.length > 1)
        {
            record[1] = Math.max(nums[0],nums[1]);
        }
        for (int i = 2; i < nums.length; i++) {
            record[i] = Math.max(record[i-2] + nums[i], record[i-1]);
        }
        return record[nums.length-1];
    }

}