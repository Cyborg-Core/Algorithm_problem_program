from typing import List


class Solution:
    def sum_all(self, n):
        return n + n * (n - 1) // 2
    def minimalKSum(self, nums: List[int], k: int) -> int:
        sum_r = 0
        for n in sorted(set(nums)):
            if n<=k:
                sum_r +=n
                k +=1
            else:
                break
        return self.sum_all(k) - sum_r