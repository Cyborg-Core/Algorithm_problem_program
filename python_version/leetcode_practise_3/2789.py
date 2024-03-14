from typing import List


class Solution:
    def maxArrayValue(self, nums: List[int]) -> int:
        result = nums[-1]
        for i in range(-2, -len(nums)-1, -1):
            if nums[i+1] >= nums[i]:
                nums[i] += nums[i+1]
                result = max(nums[i],result)
        return  max(nums[0],result)

# class Solution:
#     def maxArrayValue(self, nums: List[int]) -> int:
#         sum = nums[-1]
#         for i in range(len(nums)-2,-1,-1):
#             sum = sum + nums[i] if sum>=nums[i] else nums[i]
#         return sum

if __name__ == '__main__':
    print(Solution().maxArrayValue([2,3,7,9,3,4]))