class Solution:
    def maximumScore(self, nums: List[int], k: int) -> int:
        n = len(nums)
        left, right = k - 1, k + 1
        ans = 0
        for i in range(nums[k], 0, -1):
            while left >= 0 and nums[left] >= i:
                left -= 1
            while right < n and nums[right] >= i:
                right += 1
            ans = max(ans, (right - left - 1) * i)
        return ans

