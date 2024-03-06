class Solution:
    def findKOr(self, nums: List[int], k: int) -> int:
        ans = 0
        for i in range(31):
            cnt = sum(1 for num in nums if ((num >> i) & 1) > 0)
            if cnt >= k:
                ans |= 1 << i
        return ans
