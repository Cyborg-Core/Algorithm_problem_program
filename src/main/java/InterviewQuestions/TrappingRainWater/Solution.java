package InterviewQuestions.TrappingRainWater;
//https://leetcode-cn.com/problems/trapping-rain-water/
public class Solution {

    public int trap(int[] height) {
        int left[] = new int[height.length];

        int max = 0;
        for (int i = 0; i < height.length; i++) {
            if(height[i] > max)
            {
                max = height[i];
                left[i] = height[i];
            }else{
                left[i] = max;
            }
        }
        int count = 0;
        max = height[height.length-1];
        for (int i = height.length-2; i >=0 ; i--) {
            if(height[i] < left[i] && height[i]<max)
            {
                count += Math.min(max,left[i]) - height[i];
            }
            else if(height[i]>max) {
                max = height[i];
            }
        }
        return count;
    }
}
