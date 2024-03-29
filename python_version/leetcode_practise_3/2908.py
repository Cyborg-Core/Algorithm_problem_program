class Solution:
    def minimumSum(self, nums: List[int]) -> int:
        n = len(nums)
        res = 1000
        for i in range(n):
            for j in range(i + 1, n):
                for k in range(j + 1, n):
                    if nums[i] < nums[j] and nums[k] < nums[j]:
                        res = min(res, nums[i] + nums[j] + nums[k])
        return res if res < 1000 else -1

