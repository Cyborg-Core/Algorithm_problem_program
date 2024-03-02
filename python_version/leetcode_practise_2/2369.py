class Solution:
    def validPartition(self, nums: list[int]) -> bool:
        result = [True] + [False] * len(nums)
        for i, n in enumerate(nums):
            print(i)
            if not result[i]: continue
            if i + 1 >= len(nums): break

            if n == nums[i + 1]:
                result[i + 2] = True
            if i + 2 >= len(nums): break
            if n == nums[i + 1] == nums[i + 2]:
                result[i + 3] = True
            if n == nums[i + 1] - 1 == nums[i + 2] - 2:
                result[i + 3] = True
        return result[-1]