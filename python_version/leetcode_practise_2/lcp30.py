import heapq
from typing import List


class Solution:
    def magicTower(self, nums: List[int]) -> int:
        q = []
        if sum(nums) < -1:
            return -1
        blood = 1
        count = 0
        for n in nums:
            if n < 0:
                heapq.heappush(q, n)
            blood += n
            while blood <= 0:
                count += 1
                blood -= heapq.heappop(q)

        return count