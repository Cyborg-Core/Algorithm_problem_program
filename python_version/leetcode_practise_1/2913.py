from typing import List


class Solution:
    def sumCounts(self, nums: List[int]) -> int:
        l = len(nums)
        count = 0
        for i in range(l):
            r_set = set()
            for j in range(i,l):
                r_set.add(nums[j])
                count += (len(r_set) ** 2)
                count %= 1000000007
        return count
